package com.loy.test;

import com.loy.spring.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext clas = new ClassPathXmlApplicationContext("beanBook.xml");
        BookService bookService = clas.getBean("bookService", BookService.class);
        bookService.getBookInfo();
    }
}
