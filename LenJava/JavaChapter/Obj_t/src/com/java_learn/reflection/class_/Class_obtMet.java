package com.java_learn.reflection.class_;

import com.java_learn.reflection.Dog;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 获取class对象实例的方式
 */
public class Class_obtMet {
    public static void main(String[] args) throws Exception {
//        1.Class.forName()
        String classPath="com.java_learn.reflection.Dog";
        Class<?> aClass = Class.forName(classPath);
        System.out.println(aClass);
//        2.类名.class
        Class<?> aClass1 = Dog.class;
        System.out.println(aClass1);
//        3.对象.getClass()
        Dog dog=new Dog();
        Class<?> aClass2=dog.getClass();
        System.out.println(aClass2);
//        4.通过类加载器：对象.getClass().getClassLoader().loadClass("全类名")
        Class<?> aClass3 = dog.getClass().getClassLoader().loadClass(classPath);
        System.out.println(aClass3);
//        5.基本数据类型获取Class类对象：基本数据类型.class
        Class<?> aClass4 = int.class;
        System.out.println(aClass4);
//        6.基本数据类型包装类获取class类对象：包装类.TYPE
        Class<Integer> aClass5 = Integer.TYPE;
        System.out.println(aClass5);
    }
}
