package com.java_learn.oop_midrange.polymor_;

public class Animal {
  private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    方法的多态
     */
    public void over_load(){
        System.out.println("动物再叫。。");
    }
    public void  over_load(String name){
        System.out.println(name+"在叫。。。");
    }
    public void  over_ride(){
        System.out.println("animal方法重写");
    }
}
class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void over_ride(){
        System.out.println("cat重写了animal的方法");
    }
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

}
