package com.java_learn.oop_midrange.modifyer_;

public class m2 {
   m1 m= new m1();
   public void show(){
       System.out.println(m.a);
       System.out.println(m.b);
       System.out.println(m.d);
//       System.out.println(m.c);此时c属性不可使用，具有private
   }
}
