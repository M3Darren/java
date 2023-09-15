package com.java_learn.commonly_used_class;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class StringMemoryLayout {
    public static void main(String[] args) {
        String s1="echom6";
        Tt t=new Tt(s1);
        Tt t1=new Tt(s1);
        System.out.println(t==t1);
        System.out.println(t.equals(t1));//注意Tt类没有重写，所以比较的还是对象地址
        System.out.println(t.name==t1.name);

        String s2=new String("echom6");
        String s3="echom6";
        System.out.println(s1==s2);
        System.out.println(s2==s3);

        String n1="hello"+s1;
        String t3="helloechom6";
        System.out.println(n1.intern()==t3);
    }
}
class Tt{
    String name;

    public Tt(String name) {
        this.name = name;
    }
}