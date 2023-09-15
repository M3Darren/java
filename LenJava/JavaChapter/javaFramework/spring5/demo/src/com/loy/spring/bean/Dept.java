package com.loy.spring.bean;

public class Dept {
//    部门类
private String dName;

    public void setdName(String dName) {
        this.dName = dName;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
