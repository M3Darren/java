package com.java_learn.oop_midrange.polymor_;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    传统思路实现多态
    每次新加子类，必须重构方法
    代码臃余
     */
    public void show(Cat cat,Fish fish){
        System.out.println(this.name+"正在给"+cat.getName()+"投喂"+fish.getName());
    }
    public  void  show(Dog dog,Bone bone){
        System.out.println(this.name+"正在给"+dog.getName()+"投喂"+bone.getName());
    }


    /*
    对象多态
     */
    public void show(Animal animal,Food food){
        System.out.println(this.name+"正在给"+animal.getName()+"投喂"+food.getName());
    }
}
