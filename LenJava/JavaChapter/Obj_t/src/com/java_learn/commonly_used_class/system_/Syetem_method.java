package com.java_learn.commonly_used_class.system_;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary System类常用方法
 */
public class Syetem_method {
    public static void main(String[] args) {
//          0表示正常退出
//        System.exit(0);

        //arraycopy底层拷贝数组
        int[] arr={1,2,3};
        int[] arr1=new int[3];
        System.arraycopy(arr,0,arr1,0,3);
    }
}
