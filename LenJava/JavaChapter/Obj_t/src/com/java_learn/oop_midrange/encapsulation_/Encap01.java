package com.java_learn.oop_midrange.encapsulation_;

public class Encap01 {
    public static void main(String[] args) {
/*
封装
要求：
    创建Person类，有姓名，年龄，工资，职位
    年龄，工资，职位不可看
 */
        Person p = new Person("Jack",21,30000);
        /*p.setName("OG80");
        p.setAge(21);
        p.setSalary(499);*/
        System.out.println(p.info());
        System.out.println(p.getAge());
    }
}

