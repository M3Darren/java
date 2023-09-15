package com.loy.springdataredis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.loy.springdataredis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class TestStringRt {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private static final ObjectMapper objectMapper=new ObjectMapper();
    @Test
    public void testStringRt() throws JsonProcessingException {
        //创建对象
        User user = new User(1, "zhangsan");
        //手动序列化
        String userStr = objectMapper.writeValueAsString(user);
        //写入数据
        stringRedisTemplate.opsForValue().set("srtUser", userStr);
        //获取数据
        String jsonUser = stringRedisTemplate.opsForValue().get("srtUser");
        //手动反序列化
        User user1 = objectMapper.readValue(jsonUser, User.class);
        System.out.println(user1);
    }
}
