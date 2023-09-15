package com.java_learn.oop_advanced.interface_;

public class Exercises {
    public static void main(String[] args) {
        D d=new D();
        System.out.println(D.a);
        System.out.println(S.a);
        System.out.println(d.a);
    }
}
interface S{
    int a=12;//默认前面有修饰符public static final
}
class D implements S{

}
