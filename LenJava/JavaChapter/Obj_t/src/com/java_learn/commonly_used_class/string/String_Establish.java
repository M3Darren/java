package com.java_learn.commonly_used_class.string;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary String对象创建
 */
public class String_Establish {
    public static void main(String[] args) {
//        方法一
        String s="aaa";
        String s1="aaa";
        System.out.println(s.equals(s1));
        System.out.println(s==s1);

        //方法二
        String a=new String("ccc");
        String a1=new String("ccc");
        System.out.println(a.equals(a1));
        System.out.println(a==a1);

        //intern方法
        //当池中有该字符串则返回池中地址，若没有则在池中创建字符串后，返回该对象的引用
        System.out.println(a==a1.intern());//T此时为真是因为intern方法返回的是常量池地址不是value的地址
        System.out.println(a1==a1.intern());//F a1为value地址，a1.intern为常量池地址

    }
}
