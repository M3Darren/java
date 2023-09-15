package com.java_learn.oop_advanced.interface_;

public class Interface {
    public static void main(String[] args) {
        Sub_I01 sub_i01 = new Sub_I01();
        sub_i01.say();
    }
}
interface I01{
    public int n=1;
    public void say();
}
class Sub_I01 implements I01{
    @Override
    public void say() {
        System.out.println("hi...");
    }
}