package com.java_learn.commonly_used_class;

import java.util.Arrays;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 字符串相关操作的方法
 */
public class StringOperation_ {
    public static void main(String[] args) {
        try {
            StrOpin("Li xiao Lu");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        statistics("21# 23 11 SDA");
    }
    /*
    需求：
    将英文名形如：Li Xiao Lu 转换成 Lu Li.X
     */
    public static void StrOpin(String name){
        //将字符串分割
        String[] n=name.split(" ");
        if(n.length!=3){
            throw new RuntimeException("此名字不能转换");
        }
        System.out.println(n[2]+" "+n[0]+"."+n[1].toUpperCase().charAt(0));
        //或者使用字符串格式化函数
        String.format("%s %s.%c",n[2],n[0],n[1].toUpperCase().charAt(0));
    }
    /*
    需求：输入字符串统计大小写字母、数字和空格数量
     */
    public static void statistics(String str){
        char[] arr=str.toCharArray();
        System.out.println(Arrays.toString(arr));
        int Upcase=0,Downcase=0,number=0,other=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='0' && arr[i]<='9'){
                number++;
            } else if (arr[i]>='a' && arr[i]<='z') {
                Downcase++;
            } else if (arr[i]>='A' && arr[i]<='Z') {
                Upcase++;
            }else{
                other++;
            }
        }
        System.out.println("大写字母个数："+Upcase);
        System.out.println("小写字母个数："+Downcase);
        System.out.println("数字个数："+number);
        System.out.println("其他字符个数："+other);
    }
}
