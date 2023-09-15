package com.loy.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class TestRedis {
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void testMyRedis(){
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("hello","world");
        String hello = valueOperations.get("hello");
        System.out.println(
                hello
        );
    }
}
