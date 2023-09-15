package com.java_learn.commonly_used_class.stringbuffer_;


/**
 * @author ECHOm6
 * @version 1.0
 * @Summary StringBuffer转换
 */

public class Sbuffer01 {
    public static void main(String[] args) {
        String aa=new String("hello");
        //创建char[] value大小为十六


//        String -->  StringBuffer
//        方法一：构造器
        StringBuffer sb=new StringBuffer(aa);
//        方法二:append方法
        StringBuffer sb1=new StringBuffer();
        sb1=sb1.append(aa);

//        StringBuffer  --->  String
//        方法一：toString
        StringBuffer sb2=new StringBuffer();
        String s1=sb2.toString();
//        方法二：构造器
        String s2=new String(sb2);
    }
}