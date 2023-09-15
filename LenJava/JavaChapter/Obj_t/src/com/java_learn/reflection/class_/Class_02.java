package com.java_learn.reflection.class_;

import java.lang.reflect.Field;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary Class常用方法
 */
public class Class_02 {
    public static void main(String[] args) throws Exception {
        String classPath="com.java_learn.reflection.Dog";
        Class<?> aClass = Class.forName(classPath);
        System.out.println(aClass);
        System.out.println(aClass.getClass());//获取运行类型
        System.out.println(aClass.getPackage().getName());//获取类所在包
//        创建对应类的实例
        Object o = aClass.newInstance();
        Field name = aClass.getField("name");//获取单个属性
        name.set(o,"柯基");//将o对象实例的name值改为柯基
        Field[] fields = aClass.getFields();//获取所有属性
        for(Field f:fields){
            System.out.println(f.getName());
        }
    }
}
