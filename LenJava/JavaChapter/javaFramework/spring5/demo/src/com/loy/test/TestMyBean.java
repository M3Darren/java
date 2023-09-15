package com.loy.test;

import com.loy.spring.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cla = new ClassPathXmlApplicationContext("beanFactory.xml");
        Student mybean = cla.getBean("mybean", Student.class);
        System.out.println(mybean);
    }
}
