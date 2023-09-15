package com.loy.lambda;

import org.springframework.context.support.GenericApplicationContext;

public class LambdaRefisterObject {
    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
//        注册对象
        context.refresh();
        context.registerBean("use", User.class,()->new User());
//        获取在spring中注册的对象
        Object use = context.getBean("use");
        System.out.println(use);
    }
}
