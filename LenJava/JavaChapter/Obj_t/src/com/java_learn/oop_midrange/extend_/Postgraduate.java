package com.java_learn.oop_midrange.extend_;

class Postgraduate extends Student {
    Postgraduate(){
//        super("张三",18);
        System.out.println("这里是子类构造器。。。");
    }
    Postgraduate(String name,int age){
//        super(name,age);
        System.out.println("这里是有参构造器。。。");
    }
    public void test(){
        System.out.println("研究生"+name+"正在考试。。。");
    }
}
