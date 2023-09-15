package com.loy.springdataredis;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class TestSDR {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testRedisString(){
        redisTemplate.opsForValue().set("SDRname","springdataredis");
        Object o = redisTemplate.opsForValue().get("SDRname");
        System.out.println(o);
    }
}
