package com.java_learn.oop_advanced.codeblock;

public class Code_blockDetail01 {
    public static void main(String[] args) {
        /**
         * 一个对象，一个类中调用顺序
         * 静态代码块和静态属性的初始化
         * 普通代码块和普通属性初始化
         * 构造器
         */
        CbD1 cbD1= new CbD1();

    }
}
class CbD1{
    private  static int num=getn1();
    private int num2=getn2();
    {
        System.out.println("这里是普通代码块");
    }
    static {
        System.out.println("这里是静态代码块");
    }

    public static int getn1(){
        System.out.println("这里是getn1方法");
        return 100;
    }
    public int getn2(){
        System.out.println("这里是getn2方法");
        return 200;
    }
}
