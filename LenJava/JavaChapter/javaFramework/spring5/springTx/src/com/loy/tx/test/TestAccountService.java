package com.loy.tx.test;

import com.loy.tx.service.AccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccountService {
    public static void main(String[] args) {
        //基于配置文件实现
         ApplicationContext context = new ClassPathXmlApplicationContext("beanBydruid.xml");
        AccountService accountService = context.getBean("accountService", AccountService.class);
        accountService.transferByTx();
    }

    public void  ma(){

    }
}
