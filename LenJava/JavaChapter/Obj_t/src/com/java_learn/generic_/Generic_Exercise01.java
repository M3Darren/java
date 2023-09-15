package com.java_learn.generic_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 将三个学生对象存入HashMap，要求K为String类型，V为学生类型
 */
public class Generic_Exercise01 {
    public static void main(String[] args) {
        HashMap<String, Student> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("zhangsan",new Student("zhangsan",11));
        Set<Map.Entry<String, Student>> entries = objectObjectHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey());
        }
    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
