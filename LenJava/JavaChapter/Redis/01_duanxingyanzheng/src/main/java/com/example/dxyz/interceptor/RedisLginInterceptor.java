package com.example.dxyz.interceptor;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.example.dxyz.pojo.User;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class RedisLginInterceptor implements HandlerInterceptor {
    private StringRedisTemplate stringRedisTemplate;
//    作用：在拦截器中传入，等同自动注入
    public RedisLginInterceptor(StringRedisTemplate stringRedisTemplate){
        this.stringRedisTemplate=stringRedisTemplate;
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //1.获取请求头中的token
        String token = request.getHeader("token");
       if (StrUtil.isBlank(token)){
           return true;
       }
        Map<Object, Object> map = stringRedisTemplate.opsForHash().entries(token);
        //2.获取通过token获取其中的用户
       if(map.isEmpty()){
           return true;
       }
        User user = BeanUtil.fillBeanWithMap(map, new User(), false);
        //5.存在，保存用户信息到ThreadLocal中
        UserThreadLocal.saveUser(user);
//        刷新过期时间
        stringRedisTemplate.expire(token,30L, TimeUnit.MINUTES);
        //6.放行
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        //执行完成之后
        UserThreadLocal.removeUser();
    }
}
