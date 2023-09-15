package com.loy.spring.bean;

public class Emp {
    //员工类
    private String eName;
    private String eGender;
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public String geteName() {
        return eName;
    }

    public String geteGender() {
        return eGender;
    }

    public Dept getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", eGender='" + eGender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
