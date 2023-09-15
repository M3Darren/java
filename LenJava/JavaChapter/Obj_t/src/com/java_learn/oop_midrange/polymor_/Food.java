package com.java_learn.oop_midrange.polymor_;

public class Food {
  private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*
    对象多态
     */
    public  void info(){
        System.out.println(this.name);
    }
}
class Fish extends Food{
    public Fish(String name) {
        super(name);
    }

}
class Bone extends Food{
    public Bone(String name) {
        super(name);
    }

}