package com.java_learn.commonly_used_class;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary String练习
 */
public class String_Exercise {
    public static void main(String[] args) {
        /*
        需求：
        将给定字符串指定位置翻转：
        如：a bcde f  翻转为a edcb f
         */
        String str="abcdefg";
        System.out.println(reser(str,0,4));

    }
    public static String reser(String str,int start,int end){
        //将字符串转成数组实现
        char[] value=str.toCharArray();
        char tmp;
        for (int i = start; i <=(start+end)/2 ; i++,end--) {
            tmp=value[i];
            value[i]=value[end];
            value[end]=tmp;
        }
        String st=new String(value);
        return  st;
    }
}
