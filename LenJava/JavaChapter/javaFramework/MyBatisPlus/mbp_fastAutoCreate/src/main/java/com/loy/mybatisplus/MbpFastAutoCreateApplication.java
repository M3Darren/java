package com.loy.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.loy.mybatisplus.mapper")
public class MbpFastAutoCreateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbpFastAutoCreateApplication.class, args);
    }

}
