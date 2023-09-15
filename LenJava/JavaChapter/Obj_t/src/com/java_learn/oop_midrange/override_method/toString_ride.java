package com.java_learn.oop_midrange.override_method;

public class toString_ride {
    public static void main(String[] args) {
        Tos t=new Tos("to",21);
    }
}
class Tos{
    public String name;
    public int age;

    public Tos(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tos{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}