package com.java_learn.oop_midrange.override_method;

public class equals_ride {
    public static void main(String[] args) {
        Per p=new Per("zhangsan",21);
        Per p1=new Per("zhangsan",21);
        System.out.println(p.equals(p1));

    }
}
class Per{
    public String name;
    public int age;

    public Per(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if (obj instanceof Per){
            Per p=(Per)obj;
            return this.name.equals(p.name) && this.age==p.age;
        }
        return false;
    }
}
