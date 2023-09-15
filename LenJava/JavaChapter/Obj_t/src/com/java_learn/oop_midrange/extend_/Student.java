package com.java_learn.oop_midrange.extend_;

class Student {
    public String name;
    protected int age;
    private double score;
    Student(){
        System.out.println("这里是父类构造器。。。");
    }
    Student(String name,int age){
        System.out.println("这里是父类有参构造器。。。");
    }
    public void setScore(double score) {
        this.score = score;
    }
    public void show(){
        System.out.println("name:"+this.name+"\tage:"+this.age+"\tsocre:"+this.score);
    }
}
