package com.java_learn.commonly_used_class.Arrays_;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary Arrays类的常用方法
 */
public class Arro1 {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,-1,0,12};

        //输出数组元素,返回的是字符串
        System.out.println(Arrays.toString(integers));

        //sort排序：1.默认冒泡排序 2.定制排序，实现了Comparator接口
        //方法一
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
        //方法二
        Arrays.sort(integers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1=(Integer) o1;
                Integer i2=(Integer) o2;
                return i2-i1;//底层通过二叉排序，返回的正负决定排序顺序
            }
        });
        System.out.println(Arrays.toString(integers));

        //binarySearch()二分查找
        //1.数组必须有序
        //2.如果找到该元素返回：-index
        //3.如果未找到元素返回：-(low+1);low表示应该出现的位置，即为该元素在数组所排列位置
        System.out.println(Arrays.binarySearch(integers,1));

        //copyOf()数组拷贝
        //如果新数组长度>原数组则多余的置空
        Integer[] arr=Arrays.copyOf(integers,integers.length+1);
        System.out.println("arr copy integers:"+Arrays.toString(arr));

        //fill()填充
        int[] a={1,2,3};
        System.out.println("fill before array a:"+Arrays.toString(a));
        Arrays.fill(a,0);
        System.out.println("fill after array a:"+Arrays.toString(a));

        //asList 将一组值转换成集合
        List<Integer> asList=Arrays.asList(1,2,3,4);
        System.out.println("asList="+asList);
    }
}
