package com.java_learn.reflection.classload_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 类加载初始化
 */
public class ClassLoadInitialization {
    public static void main(String[] args) {

        /**分析：
         * 初始化会将静态变量和静态代码块语句按顺序收集，再合并
         *  System.out.println("静态代码块");
         *         num=12;
         *         num=10;
         *
         *         合并：
         *         System.out.println("静态代码块");
         *         num=10;
         */
        System.out.println(ClassLoadInitialization.num);
    }
    static {
        System.out.println("静态代码块");
        num=12;
    }
    static int num=10;
}

