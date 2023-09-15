package com.java_learn.oop_midrange.override_.Exercises;

public class Student extends Person{
    private int id;
    private  double score;

    public Student(int id, double score,String name,int age) {
        super(name,age);
        this.id = id;
        this.score = score;
    }
    public String Say(){
        return "学号："+this.id+"成绩："+this.score+super.Say();
    }
}
