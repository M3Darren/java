package com.java_learn.reflection.reflectcreateobj;

import java.lang.reflect.Field;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 反射访问成员属性
 */
public class RefAccFed {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.java_learn.reflection.reflectcreateobj.Test1");
        Object o = aClass.newInstance();
        Field age = aClass.getField("age");
        age.set(o,12);
        System.out.println(o);

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"akkp");
        System.out.println(o);
    }
}
class Test1{
    public int age;
    private static String name;

    public Test1() {
    }


    @Override
    public String toString() {
        return "Test [age="+age+",name="+name+"]";
    }
}
