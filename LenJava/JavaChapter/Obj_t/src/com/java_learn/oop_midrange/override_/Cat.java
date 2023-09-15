package com.java_learn.oop_midrange.override_;

class Cat extends Animal{
   public void cry(){
      System.out.println("猫在喵喵叫。。。");
   }
   public String Fson(){
      System.out.println("返回类型为父类Object的子类");
      return null;
   }
}
