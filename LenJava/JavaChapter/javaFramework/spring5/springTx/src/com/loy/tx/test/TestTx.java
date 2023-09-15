package com.loy.tx.test;

import com.loy.tx.config.SpringConfig;
import com.loy.tx.service.AccountService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestTx {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = annotationConfigApplicationContext.getBean("accountService", AccountService.class);
        accountService.transferByTx();
    }
}
