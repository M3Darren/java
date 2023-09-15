package com.loy.spb_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpbWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpbWebApplication.class, args);
    }
}
