package com.java_learn.oop_advanced.static_;

public class Traditional_variable {
    public static void main(String[] args) {
        /**
         * 传统方法解决计数：
         * 问题
         * 1.计数器与对象脱离关系
         */
        int count=0;
        new Child("zhangsan").info();
        count++;
        new Child("lisi").info();
        count++;
        new Child("wangwu").info();
        count++;
        System.out.println("当前有"+count+"个人加入游戏");

    }
}
class Child{
    public String name;

    public Child(String name) {
        this.name = name;
    }
    public void info(){
        System.out.println(this.name+"加入了游戏");
    }
}
