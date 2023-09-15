package com.loy.spring5.web;

import com.loy.spring5.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SampleForConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext antC = new AnnotationConfigApplicationContext(SpringConfig.class);


    }
}
