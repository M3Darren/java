package com.java_learn.reflection.re_mechanism;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 反射常用类
 */
public class ReMech {
    public static void main(String[] args) throws Exception {

        Properties properties= new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath= properties.get("classfullpath").toString();
        String method =properties.get("method").toString();

        //使用Class常用API
//        获取该类对应的Class对象
        Class cls=Class.forName(classfullpath);
        Object o=cls.newInstance();
//        获取成员方法
        Method med=cls.getMethod(method);
        med.invoke(o);
//        获取成员属性
        Field name = cls.getField("name");//不能获取私有成员
        System.out.println(name.get(o));
        //获取构造器
        Constructor constructor = cls.getConstructor();
        Constructor constructor1 = cls.getConstructor(String.class);//有参构造器

    }
}
