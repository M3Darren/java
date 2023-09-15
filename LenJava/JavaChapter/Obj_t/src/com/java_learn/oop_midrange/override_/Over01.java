package com.java_learn.oop_midrange.override_;

public class Over01 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.cry();//发生重写
//        d.cry1();//修饰符发生变化不构成重写
        Cat c=new Cat();
        c.cry();//发生重写
    }
}
