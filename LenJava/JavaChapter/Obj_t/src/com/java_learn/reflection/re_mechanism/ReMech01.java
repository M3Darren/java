package com.java_learn.reflection.re_mechanism;

import com.java_learn.reflection.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 传统方法和反射执行速度对比
 */
public class ReMech01 {
    public static void main(String[] args) throws Exception {
        m1();
        m2();
        reflectionTuning();
    }
    public static void m1(){
        Cat cat=new Cat();
        Long start=System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            cat.hi();
        }
        Long end=System.currentTimeMillis();
        System.out.println("传统方法执行时间："+(end-start));
    }
    public static void m2() throws Exception{
        Class cls=Class.forName("com.java_learn.reflection.Cat");
        Object o=cls.newInstance();
        Method hi = cls.getMethod("hi");

        Long start=System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            hi.invoke(o);
        }
        Long end=System.currentTimeMillis();
        System.out.println("反射方法执行时间："+(end-start));
    }

    public static void reflectionTuning() throws Exception {
        Class cls=Class.forName("com.java_learn.reflection.Cat");
        Object o=cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);//取消访问检测，提高执行效率
        Long start=System.currentTimeMillis();
        for (int i = 0; i < 999999999; i++) {
            hi.invoke(o);
        }
        Long end=System.currentTimeMillis();
        System.out.println("反射方法关闭访问检查执行时间："+(end-start));
    }
}
