package com.java_learn.alllist_.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary Arraylist的常用方法
 */
public class List_met {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("akko");
        list.add("mk");
        //add(index,ele)指定索引处插入对象
        list.add(1,"durk");
        System.out.println(list.toString());
        //addAll(index,list)指定索引处插入多个元素
        List list1=new ArrayList();
        list1.add("aa");
        list1.add("bb");
        list.addAll(1,list1);
        System.out.println(list.toString());
        //get(index)获取指定索引的元素
        System.out.println(list.get(1));
        //indexOf(obj)返回对象第一次出现的位置索引
        System.out.println(list.indexOf("aa"));
        //lastIndexOf(obj)返回对象最后一次出现的位置
        System.out.println(list.lastIndexOf("akk"));
        //remove(index)移除指定位置的元素
        list.remove(1);
        System.out.println(list);
        //set(index,ele)替换指定索引的元素
        list.set(1,"aa");
        System.out.println(list);
        //subList(fromIndex,toIndex)返回从fromIndex到toIndex的子集合
        List list2=list.subList(0,2);//索引范围[0,2)
        System.out.println(list2);

    }
}
