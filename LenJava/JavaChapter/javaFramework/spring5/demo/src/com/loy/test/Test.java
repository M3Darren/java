package com.loy.test;

import com.loy.spring.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanUser.xml");
        User user = classPathXmlApplicationContext.getBean("user", User.class);
        User user1 = classPathXmlApplicationContext.getBean("user1", User.class);
        System.out.println(user);
        System.out.println(user1);
    }
}
