package com.java_learn.commonly_used_class.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 模拟sort定制排序
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr={1,2,6,-1,2,5,99};
        bubble(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1=(Integer) o1;
                int i2=(Integer) o2;
                return i1-i2;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble(int[] arr, Comparator c){
        int tmp=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(c.compare(arr[j],arr[j+1])>0){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

    }

}
