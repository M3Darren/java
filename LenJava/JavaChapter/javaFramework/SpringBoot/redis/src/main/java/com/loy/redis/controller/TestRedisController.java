package com.loy.redis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRedisController {
    @RequestMapping("/redis")
    public String testRedis(){
        return "hello redis";
    }
}
