package com.java_learn.reflection.reflectcreateobj;

import java.lang.reflect.Constructor;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 通过反射创建对象
 */
public class RrfCrO {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.java_learn.reflection.reflectcreateobj.Test");
        //方式1：通过反射创建该类对象（改类必须有无参构造器）
        Object o = aClass.newInstance();
        System.out.println(o);
        //方式2：通过调用特定构造器创建对象
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object daipan = constructor.newInstance("daipan");
        System.out.println(daipan);
        //方式3：通过非public构造器创建实例(暴破）
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true);//暴破
        Object jj = declaredConstructor.newInstance(32, "jj");
        System.out.println(jj);
    }
}
class Test{
    private int age=22;
    private String name="dp";

    public Test() {
    }

    public Test(String name) {
        this.name = name;
    }

    private Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test [age="+age+",name="+name+"]";
    }
}
