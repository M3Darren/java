package com.java_learn.generic_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Generic_Exercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("zhangsan",12000.1,new myDate(12,2,2022)));
        employees.add(new Employee("lisi",32131.2,new myDate(1,21,2022)));
        employees.add(new Employee("wangwu",213213.4,new myDate(4,2,2004)));
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
               int  n=o1.getName().compareTo(o2.getName());
                if (n!=0){
                    return n;
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private double sal;
    private myDate birthday;

    public Employee(String name, double sal, myDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public myDate getBirthday() {
        return birthday;
    }

    public void setBirthday(myDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}'+"\n";
    }
}
class myDate implements Comparable<myDate>{
    private int month;
    private int day;
    private int year;

    public myDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "myDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(myDate o) {
        int  y=year-o.getYear();
        int  m=month-o.getMonth();
        int  d=day-o.getDay();
        if (y!=0){
            return y;
        }
        if (m!=0){
            return m;
        }
        return d;
    }
}
