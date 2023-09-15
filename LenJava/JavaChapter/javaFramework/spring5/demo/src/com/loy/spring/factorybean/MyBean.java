package com.loy.spring.factorybean;

import com.loy.spring.bean.Student;
import com.loy.spring.dao.BookDao;
import org.springframework.beans.factory.FactoryBean;

import java.util.Arrays;
import java.util.List;

public class MyBean implements FactoryBean<Student> {
    @Override
    public Student getObject() throws Exception {
        Student student = new Student();

        student.setCourse(new String[]{"list"});
        return student;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
