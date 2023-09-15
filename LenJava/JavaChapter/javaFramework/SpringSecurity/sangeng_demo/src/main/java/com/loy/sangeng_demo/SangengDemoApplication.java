package com.loy.sangeng_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.loy.sangeng_demo.mapper")
public class SangengDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SangengDemoApplication.class, args);
    }

}
