package com.java_learn.oop_midrange.override_.Exercises;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String Say(){
        return "名字："+this.name+"年龄："+this.age;
    }
}

