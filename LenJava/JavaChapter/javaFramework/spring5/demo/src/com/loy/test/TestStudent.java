package com.loy.test;

import com.loy.spring.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cla = new ClassPathXmlApplicationContext("beanArr.xml");
        Student stu = cla.getBean("stu", Student.class);
        System.out.println(stu);

        ClassPathXmlApplicationContext cla1 = new ClassPathXmlApplicationContext("beanArrUtil.xml");
        Student stu1 = cla1.getBean("Stu", Student.class);
        System.out.println(stu1);
    }
}
