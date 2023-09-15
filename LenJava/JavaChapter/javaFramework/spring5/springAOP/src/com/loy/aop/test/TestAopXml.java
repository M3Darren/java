package com.loy.aop.test;

import com.loy.aop.xml.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext aop = new ClassPathXmlApplicationContext("beanaop.xml");
        Book book = aop.getBean("book", Book.class);
        book.getId();
    }
}
