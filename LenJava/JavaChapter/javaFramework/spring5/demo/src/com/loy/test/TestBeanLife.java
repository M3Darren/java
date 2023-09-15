package com.loy.test;

import com.loy.spring.bean.BeanLifeCycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLife {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cla = new ClassPathXmlApplicationContext("beanLife.xml");
        BeanLifeCycle beanLife = cla.getBean("beanLife", BeanLifeCycle.class);
        System.out.println("第四步：使用bean；"+beanLife);
        cla.close();
    }
}
