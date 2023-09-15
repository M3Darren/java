package com.java_learn.oop_midrange.package_;
import java.util.Arrays;

public class Imp01 {
    /*
    包的引入
     */
    public static void main(String[] args) {
        //使用Arrays对数组排序
        int[] arr={12,2,1,43,2,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
