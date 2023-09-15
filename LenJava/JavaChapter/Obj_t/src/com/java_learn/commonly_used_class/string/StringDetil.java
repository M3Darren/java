package com.java_learn.commonly_used_class.string;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */

public class StringDetil{
    public static void main(String[] args){
    Ts ex=new Ts();
        ex.change(ex.str,ex.ch);
        //此时虽然str指向了java
        System.out.println(ex.str+"And"+ex.ch[0]);
//这里输出时仍然是对象的str,但是ch的第一个元素被修改
    }
}
class Ts{
    String str=new String("echo");
    final char[] ch={'j','a','v','a'};
    public void change(String str,char[] ch){
        str="java";
        ch[0]='h';
    }
}