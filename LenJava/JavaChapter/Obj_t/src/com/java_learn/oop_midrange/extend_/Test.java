package com.java_learn.oop_midrange.extend_;

public class Test {
    public static void main(String[] args) {
        /*
        用子类操作数据
         */
        College c=new College();
        c.name="李华";c.age=21;
        c.setScore(44);
        c.test();
        c.show();
    }
}
