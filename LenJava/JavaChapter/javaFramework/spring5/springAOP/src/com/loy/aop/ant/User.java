package com.loy.aop.ant;

import org.springframework.stereotype.Service;

@Service
public class User {//被增强类

    public void add( ){
        System.out.println("User的add方法被执行");

    }
}
