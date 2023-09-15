package com.loy.mybatis.pojo;

public class Employee {
    private Integer id;
    private String empName;
    private int age;
//    多对一
    private Department department;

    public Employee() {

    }

    public Employee(Integer id, String empName, int age) {
        this.id = id;
        this.empName = empName;
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
