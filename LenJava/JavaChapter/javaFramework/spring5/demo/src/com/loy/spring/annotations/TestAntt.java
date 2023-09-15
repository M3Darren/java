package com.loy.spring.annotations;

import com.loy.spring.service.AnttService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAntt {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAnnotations.xml");
        AnttService anttService = context.getBean("anttService", AnttService.class);
        anttService.add();
    }
}
