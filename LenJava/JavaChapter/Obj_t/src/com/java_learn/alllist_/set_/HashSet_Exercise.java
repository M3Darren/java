package com.java_learn.alllist_.set_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary HashSet实践
 */
public class HashSet_Exercise {
    public static void main(String[] args) {
        /*
        需求：向HashSet加入三个Employee对象，判断如果name和age相同则不添加（重写equals和hashCode方法）
         */
        HashSet hashset=new HashSet();
        hashset.add(new Employee("zhangsan",12));
        hashset.add(new Employee("lisi",12));
        hashset.add(new Employee("zhangsan",12));
        System.out.println(hashset);
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && name.equals(employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
