package com.loy.log;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLog4j2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        testBean.test();

    }
}
