package com.java_learn.oop_midrange.polymor_.arr;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say() {
        System.out.println("这里是人类的say方法");
    }
}

class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void learn() {
        System.out.println("调用学生学习方法");
    }

    @Override
    public void say() {
        System.out.println("学生：" + this.getName() + "年龄：" + this.getAge() + "成绩：" + this.score);
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void teach() {
        System.out.println("调用老师教学方法");
    }

    @Override
    public void say() {
        System.out.println("教师：" + this.getName() + "年龄：" + this.getAge() + "薪水：" + this.salary);
    }
}
