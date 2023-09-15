package com.java_learn.oop_advanced.abstract_;

public class Exercise {
    public static void main(String[] args) {
        CommonEmployee zhangsan = new CommonEmployee("zhangsan", 12, 1200);
        Manager lisi = new Manager("lisi", 13, 2000, 100);
        zhangsan.work();
        lisi.work();

    }
}
abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work(){
        System.out.println("员工\t"+this.getName()+"正在工作。。。");
    }
}
class Manager extends Employee{
    private double bones;

    public Manager(String name, int id, double salary, double bones) {
        super(name, id, salary);
        this.bones = bones;
    }
    public void work(){
        System.out.println("经理\t"+this.getName()+"正在工作。。。");
    }
}