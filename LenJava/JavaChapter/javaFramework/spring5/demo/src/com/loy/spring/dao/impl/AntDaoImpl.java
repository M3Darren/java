package com.loy.spring.dao.impl;

import com.loy.spring.dao.AntDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository(value = "antDaoImpl1")
public class AntDaoImpl implements AntDao {
    @Value(value = "loy")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public void add(){
        System.out.println("this is AntDao add method");
    }
}
