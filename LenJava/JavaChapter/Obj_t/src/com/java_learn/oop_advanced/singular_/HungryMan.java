package com.java_learn.oop_advanced.singular_;

public class HungryMan {
    public static void main(String[] args) {
        /**
         * 单例设计模式-饿汉式
         */
        System.out.println(Girlfriend.getInstance());
    }
}
class Girlfriend{
    /**
     * 1.私有化构造器
     * 2.在类内部创建对象
     * 3。暴露一个静态的公共方法
     */
    private String name;

    private Girlfriend(String name) {
        this.name = name;
    }
    private static Girlfriend gf=new Girlfriend("OG");
    public static Girlfriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
