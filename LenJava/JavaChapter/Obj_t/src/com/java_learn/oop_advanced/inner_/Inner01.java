package com.java_learn.oop_advanced.inner_;

public class Inner01 {
    public static void main(String[] args) {

    }
}
class Outer{
    private int age;

    public Outer(int age) {
        this.age = age;
    }
    {
        System.out.println("ok");
    }
    class Inner{
        private int a;
        private  String name;
    }
}