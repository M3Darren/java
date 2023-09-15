package com.java_learn.oop_midrange.extend_.Exercises;

public class E02 {
    /*
    分析构造器运行过程
     */
    public static void main(String[] args) {
        E c=new E();
    }
}
class C{
    public C(){
        System.out.println("我是C类无参构造器");
    }
}
class D extends  C{
    public  D(){
        System.out.println("我是D类无参构造器");
    }
    public D(String name){
        System.out.println("我是D类有参构造器");
    }
}
class E extends  D{
    public E(){
        this("abc");
        System.out.println("我是E类无参构造器");
    }
    public E(String name){
        super("hahaha");
        System.out.println("我是E类有参构造器");
    }
}