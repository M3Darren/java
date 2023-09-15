package com.loy.sangeng_demo.filter;

import com.loy.sangeng_demo.domain.LoginUser;
import com.loy.sangeng_demo.utils.JwtUtil;
import com.loy.sangeng_demo.utils.RedisCache;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    @Autowired
    RedisCache redisCache;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        获取token
        String token = request.getHeader("token");
        if(!StringUtils.hasText(token)){//判断token为空，后续过滤器会检查抛出信息
//            放行
            filterChain.doFilter(request,response);
            return;//此处必须return，如果不return放行后的响应会执行后面的代码
        }
//        解析token
        String userid;
        try {
            Claims claims = JwtUtil.parseJWT(token);
            userid = claims.getSubject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("token非法");
        }

//        从redis获用户信息
String redisKey="userId:"+userid;
        LoginUser cacheObject = redisCache.getCacheObject(redisKey);
        if(Objects.isNull(cacheObject)){
            throw new RuntimeException("用户未登录");
        }
//        存入SecurityContextHolder
//         获取权限信息,并且存入authentication中
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(cacheObject, null, cacheObject.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
//        放行
        filterChain.doFilter(request,response);
    }
}
