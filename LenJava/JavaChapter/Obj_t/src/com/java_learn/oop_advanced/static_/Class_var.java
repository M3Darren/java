package com.java_learn.oop_advanced.static_;

public class Class_var {
    public static void main(String[] args) {
        /**
         * 成员变量和类变量区别
         * 成员变量不可用类名访问
         */
        System.out.println(Cv.count);
        System.out.println(new Cv().num);

        /**
         * 类方法
         */
        new Cv().pay(100);
        new Cv().pay(100);
        new Cv().totalfee();

    }
}
class Cv{
    public static int count=0;
    public int num=200;

    public static void pay(double fee){
        Cv.count+=fee;
    }
    public void totalfee(){
        System.out.println("总学费："+Cv.count);

    }
}