package com.example.dxyz.config;

import com.example.dxyz.interceptor.LginInterceptor;
import com.example.dxyz.interceptor.RLI2;
import com.example.dxyz.interceptor.RedisLginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RedisWebConfig implements WebMvcConfigurer {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有请求
        registry.addInterceptor(new RedisLginInterceptor(stringRedisTemplate)).order(0);
        //拦截部分请求
        registry.addInterceptor(new RLI2()).excludePathPatterns("/user/**").order(1);
    }
}