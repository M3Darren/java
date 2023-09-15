package com.java_learn.alllist_.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 定义员工类，存入hashmap，要求键为员工id，值为对象本身
 */
@SuppressWarnings({"all"})
public class HashSet_Exercise {
    public static void main(String[] args) {
        Map hashmap=new HashMap();
        hashmap.put(1,new Employee(1,"zhangsan",143311.122));
        hashmap.put(2,new Employee(2,"lisi",12211.232));
        hashmap.put(3,new Employee(3,"wangwu",2111111.212));
        Set keyset=hashmap.keySet();
        for (Object o:keyset){
            Employee employee=(Employee) hashmap.get(o);
            if (employee.getSalary()<18000)continue;
            System.out.println(employee);
        }
        System.out.println("方法二");
        Set entryset=hashmap.entrySet();
        Iterator iterator = entryset.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = (Map.Entry) iterator.next();
            Employee employee=(Employee) next.getValue();

        }
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
