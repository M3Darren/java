package com.java_learn.oop_advanced.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能呗实例化
//        new Abs();
    }
}
abstract class Abs{
    public String name;
    private int age;
    public abstract void info();//如果一个类有抽象方法，则类必须为抽象类
}
class Abs01 extends Abs{
    public void info(){
        //若继承了抽象类，则子类必须实现所有抽象方法
    }
    /*private abstract static void info(){
    //不可以使用private final static修饰方法
    }*/
}
