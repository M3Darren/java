package com.loy.springdataredis;

import com.loy.springdataredis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class TestRedisConfig {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void testConfig(){
        redisTemplate.opsForValue().set("rcName","redis序列化");
        Object o = redisTemplate.opsForValue().get("rcName");
        System.out.println(o);
    }
    @Test
    public void testConfig1(){
        redisTemplate.opsForValue().set("user:1",new User(1,"zhangsan"));
        Object o = redisTemplate.opsForValue().get("user:1");
        System.out.println(o);
    }
}
