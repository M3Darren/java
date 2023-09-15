package com.java_learn.abnormal_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary throws抛出异常
 */
public class throws_ {
    public static void main(String[] args) {
        try {
            throws_.method();
        } catch (Exception e) {
            System.out.println(e);
        }
        Sub_t sub_t = new Sub_t();
        sub_t.m1();
    }
    public static void method() throws Exception{//throws后可是异常，也可是此异常的父类
        int n=10/0;
    }
}
class Father_t{
    public void m1() throws Exception{
        int m=121/0;
    }
}
class Sub_t extends Father_t{
    @Override
    public void m1() throws RuntimeException {//此时的异常只能和父类一致或者是父类异常的子类型
        String name=null;
        name.equals("aa");
    }
}