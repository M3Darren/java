package com.java_learn.oop_midrange.extend_.Exercises;

public class E01 {
    public static void main(String[] args) {
        /*
        分析构造器运行
         */
        B b=new B();
    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        System.out.println("a name");
    }
}
class B extends A{
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        System.out.println("b name");
    }
}