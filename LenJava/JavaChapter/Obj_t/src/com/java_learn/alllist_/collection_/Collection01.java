package com.java_learn.alllist_.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 集合体系图
 */
public class Collection01 {
    public static void main(String[] args) {
        Collection list=new ArrayList();
        //add添加
        list.add("asdsa");
        list.add("asdsa");
        System.out.println(list.toString());
        //remove删除
        list.remove("asdsa");
        System.out.println(list.toString());
        //contains查找
        list.contains("aa");
        //size获取元素个数
        System.out.println(list.size());
        //isEmpty判断是否为空
        System.out.println(list.isEmpty());
        //clear清空
        list.clear();
        //addAll添加多个元素
        List list1=new ArrayList();
        list1.add("bb");
        list1.add("cc");
        list.addAll(list1);
        System.out.println(list.toString());
        //查找多个元素是否都在
        System.out.println(list.containsAll(list1));
        //removeAll删除多个元素
        System.out.println(list.removeAll(list1));
    }
}
