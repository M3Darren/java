package com.loy.aop.dao.impl;

import com.loy.aop.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a,int b) {
        return a+b;
    }
}
