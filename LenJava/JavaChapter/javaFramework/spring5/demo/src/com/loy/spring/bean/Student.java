package com.loy.spring.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {
//    数组类型属性
    private String[] course;
//    list集合属性
    private List<String> list;
//    map集合属性
    private Map<String,String> map;

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + Arrays.toString(course) +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
