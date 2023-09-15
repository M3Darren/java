package com.java_learn.reflection.class_;

import com.java_learn.reflection.Cat;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 了解Class类
 */
public class Class_01 {
    public static void main(String[] args) throws Exception {
        //Class不是new出来的而是系统自动生成
//            【1】传统方法
//        Cat cate=new Cat();
        /*ClassLoader.java
        public Class<?> loadClass(String name) throws ClassNotFoundException {
        return loadClass(name, false);
        }
        */
//            【2】反射方式(由于传统和反射总共只会发生一次类加载，如果上述传统方法不注释，反射方法不会进入classloader
        Class.forName("com.java_learn.reflection.Cat");
        /*ClassLoader.java
         public Class<?> loadClass(String name) throws ClassNotFoundException {
         return loadClass(name, false);
        */
    }
}
