package com.loy.aop.test;

import com.loy.aop.ant.SpringConfig;
import com.loy.aop.ant.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAopAnt {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ant = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = ant.getBean("user", User.class);
         user.add();
    }
}
