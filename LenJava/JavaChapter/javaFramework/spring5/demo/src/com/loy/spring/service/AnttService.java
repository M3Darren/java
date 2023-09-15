package com.loy.spring.service;

import com.loy.spring.dao.AntDao;
import com.loy.spring.dao.impl.AntDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
/* 注解方式创建对象
*  @Service(value="anttService") 默认为小写类名，可省略不写
*  等同xml方式配置的<bean id="anttService" class=..../>
* */
@Service
public class AnttService {
    @Autowired
    private AntDaoImpl antDaoImpl;//当dao接口有多个实现类，此方法不可用;

    @Autowired
    @Qualifier(value = "antDaoImpl1")
    private AntDao antDao;//此时将会注入到具体实现类
    public void add(){
        antDao.add();
        System.out.println("this is add method;调用了AntDao类中的add方法 ;AntDaoImpl中name值："+antDaoImpl.getName());
    }

}
