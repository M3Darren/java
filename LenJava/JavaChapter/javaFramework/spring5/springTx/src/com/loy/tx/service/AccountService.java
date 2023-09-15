package com.loy.tx.service;

import com.loy.tx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
    @Autowired
    @Qualifier(value = "accountDaoImpl")
    private AccountDao accountDaoImpl;
    //    转账的业务逻辑；使用事务解决
    public void transfer(){
        try {
//        1.开启事务

//        2.业务操作
            //张三（id=1）向李四（id=2）微信转账三百块
            accountDaoImpl.outcome(1, 300);
//            模拟异常
            int i=10/0;
            accountDaoImpl.income(2, 300);
//        3.若没有异常，提交事务
        }catch (Exception e) {
//        4.若有异常，回滚事务
           throw new RuntimeException(e);
        }
    }

    @Transactional
    public void transferByTx(){
        //张三（id=1）向李四（id=2）微信转账三百块
        accountDaoImpl.outcome(1, 300);
//            模拟异常
            int i=10/0;
        accountDaoImpl.income(2, 300);
    }
}
