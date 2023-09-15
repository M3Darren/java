package com.loy.jdbc.test;

import com.loy.jdbc.bean.Tmp;
import com.loy.jdbc.service.TmpService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestTmpService {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanBydruid.xml");
        TmpService tmpService = classPathXmlApplicationContext.getBean("tmpService", TmpService.class);
        /*Tmp tmp = new Tmp(1,"zhanngsan");
        tmpService.addTmp(tmp);*/

        Tmp tmpById = tmpService.findTmpById(1);
        System.out.println(tmpById);

        System.out.println(tmpService.selTmp());
    }
}
