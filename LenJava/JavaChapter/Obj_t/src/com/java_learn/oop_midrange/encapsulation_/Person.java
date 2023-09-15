package com.java_learn.oop_midrange.encapsulation_;

class Person {
    public String name;
    private int age;
    private double salary;
    Person(String name,int age,double salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String info(){
        return "name:"+this.name+"\nage:"+this.age+"\nsalary:"+this.salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6) {
            this.name = name;
        }else{
            System.out.println("名字不合法，长度必须在2~6，已经设置默认名字：OG8");
            this.name="OG8";
        }


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1 && age<=120){
            this.age = age;
        }else{
            System.out.println("年龄不合法，必须在1~120之间，已经设置·默认年龄：18");
            this.age=18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
