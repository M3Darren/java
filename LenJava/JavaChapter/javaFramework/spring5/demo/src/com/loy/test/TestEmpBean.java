package com.loy.test;

import com.loy.spring.bean.Emp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cla = new ClassPathXmlApplicationContext("beanEmp.xml");
        Emp emp = cla.getBean("emp", Emp.class);
        Emp emp1 = cla.getBean("emp1", Emp.class);
        System.out.println(emp);
        System.out.println(emp1);
    }
}
