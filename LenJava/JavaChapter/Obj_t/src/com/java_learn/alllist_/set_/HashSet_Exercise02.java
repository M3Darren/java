package com.java_learn.alllist_.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class HashSet_Exercise02 {
    public static void main(String[] args) {
        /*
        需求：
        创建Person，name、sal、birthday属性。其中birthday为MyDate类型
        当名字和生日相同时不添加
         */
        HashSet hashSet=new HashSet();
        hashSet.add(new Person("zhuangsan",1222.1,new MyDate(1999,10,2)));
        hashSet.add(new Person("lisi",1222.1,new MyDate(1999,10,2)));
        hashSet.add(new Person("zhuangsan",1222.1,new MyDate(1999,10,2)));
        System.out.println(hashSet);
    }
}
class Person{
    private String name;
    private double sal;
    private MyDate birthday;

    public Person(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,  birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate{
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
