package com.java_learn.reflection.reflectcreateobj;

import java.lang.reflect.Method;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 暴破操作方法
 */
public class RefAccMet{
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.java_learn.reflection.reflectcreateobj.Test2");
        Object o = aClass.newInstance();
        Method m1 = aClass.getDeclaredMethod("m1", int.class, String.class);
        m1.invoke(o,111,"aks");

        Method m2 = aClass.getDeclaredMethod("m2",int.class);
        m2.setAccessible(true);
        m2.invoke(o,222);
    }
}
class Test2{
    public int age;
    private static String name;

    public Test2() {
    }

    public static void m1(int age, String name){
        System.out.println("this is my name:"+name+";age:"+age);
    }
    private static void m2(int age){
        System.out.println("this is age:"+age);
    }
}
