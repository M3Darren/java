package com.java_learn.oop_advanced.singular_;

public class LazyMan {
    public static void main(String[] args) {
        Pig p1=Pig.getInstance();
        Pig p2=Pig.getInstance();
        System.out.println(p1==p2);
    }
}
class Pig{
    private String name;

    private Pig(String name) {
        this.name = name;
    }
    private static Pig peiqi;
    public static Pig getInstance(){
        if(peiqi == null){
            peiqi=new Pig("佩奇");
        }
        return peiqi;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                '}';
    }
}