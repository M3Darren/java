package com.example.dxyz.service;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.example.dxyz.pojo.DataCenter;
import com.example.dxyz.pojo.User;
import com.example.dxyz.utils.RegexUtils;
import com.example.dxyz.utils.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class RedisUserService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 发送验证码
     *
     * @param phone
     * @return
     */
    public ResponseResult sendCode(String phone) {
        //1.校验手机号
        if (!RegexUtils.isPhoneInvalid(phone)) {
            //1.1不合法，返回错误信息
            return new ResponseResult(440, "error", "手机号格式错误");
        }

        //1.2合法：生成验证码
        String code = RandomUtil.randomNumbers(6);

        //2保存验证码到Redis中，以phone为key，code为value
        stringRedisTemplate.opsForValue().set(phone, code, 2L, TimeUnit.MINUTES);
        //TODO:3发送验证码，需第三方的sdk，此处使用日志打印
        log.info("发送验证码成功：" + code);
        return new ResponseResult(200, "success", "已发送验证码请查收");
    }

    @Autowired
    DataCenter dataCenter;

    public ResponseResult login(User user, String code, HttpSession session) {
//        1.校验手机号
        String phone = user.getPhone();
        if (!RegexUtils.isPhoneInvalid(phone)) {
//            手机号不合法
            return new ResponseResult(466, "error", "手机号不合法");
        }
//        2.校验验证码
        String cacheCode = stringRedisTemplate.opsForValue().get(phone);
        if (code == null || !code.equals(cacheCode)) {
            return new ResponseResult(466, "error", "验证码错误");
        }

//        3.TODO:前面校验都通过，则从数据库查询用户是否存在；此处使用写死数据Datacenter中获取
        Map<String, User> userMao = dataCenter.getMap();
        User user1 = userMao.get(phone);
//        4.不存在则创建用户
        if (user1 == null) {
            user1 = new User(3, "rand", phone);
        }
        dataCenter.insertUserMap(user1);
        log.info(dataCenter.getMap().toString());
//        5.将用户信息保存到redis中；以token为key，用户信息为value
        String token = UUID.randomUUID().toString();
//        由于使用的stringRedisTemplate，而id字段为integer，所以使用下述方式解决
        Map<String, Object> map = BeanUtil.beanToMap(user1, new HashMap<>(), CopyOptions.create().setFieldValueEditor((fieldName, fieldValue) -> fieldValue.toString()));
        stringRedisTemplate.opsForHash().putAll(token, map);
        stringRedisTemplate.expire(token, 30, TimeUnit.MINUTES);
        return new ResponseResult(200, "success", token);
    }
}
