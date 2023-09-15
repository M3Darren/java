package com.java_learn.commonly_used_class.stringbuffer_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary StringBuffer测试题
 */
public class Exercises {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb=new StringBuffer();
        sb=sb.append(str);//底层调用父类的appendNull
        System.out.println(sb.length());//4

        StringBuffer sb1=new StringBuffer(str);
//由于在使用的有参构造器，底层会判断str.length；此时抛出空指针异常
    }
}
