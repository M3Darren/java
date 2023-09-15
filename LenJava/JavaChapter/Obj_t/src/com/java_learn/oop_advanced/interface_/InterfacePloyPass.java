package com.java_learn.oop_advanced.interface_;

public class InterfacePloyPass {
    public static void main(String[] args) {
        /**
         * 若两个继承关系的接口中一个被实现，另一个接口也必须在该类实现
         * 间接实现的接口变量也可以指向该类
         */
        IG g=new OG();//IG没有被OG直接实现，但是可以指向OG对象
        IH h=new OG();
    }
}
interface IG{
    void ga();
}
interface IH extends IG{
    void ha();
}

class OG implements IH{
    public void ha(){}
    public void ga(){}
}