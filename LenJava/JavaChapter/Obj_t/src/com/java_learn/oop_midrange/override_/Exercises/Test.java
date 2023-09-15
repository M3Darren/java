package com.java_learn.oop_midrange.override_.Exercises;

public class Test {
    public static void main(String[] args) {
        Person p=new Person("daipan",21);
        System.out.println(p.Say());
        Student s=new Student(20193511,151,"diapan",21);
        System.out.println(s.Say());
    }
}
