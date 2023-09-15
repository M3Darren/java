package com.java_learn.alllist_.map_;

import java.util.*;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary map的六种遍历方式
 */
public class Map_Traverse_met {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "aa");
        map.put("2", "bb");
        map.put("3", "vv");
        //组1：先取key，使用get求值
        Set keyset = map.keySet();
        //方法1：增强for
        System.out.println("增强for实现遍历");
        for (Object o : keyset) {
            System.out.println(o + " = " + map.get(o));
        }
        //方法2：迭代器
        System.out.println("迭代器实现遍历");
        Iterator iterator=keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next+"  =  "+map.get(next));
        }
        //组2：直接取值
        Collection values=map.values();
        //方法1：增强for
        System.out.println("增强for，直接取值");
        for (Object o : values){
            System.out.println(o);
        }
        //方法2：迭代器
        System.out.println("迭代器直接取值");
        Iterator iterator1=values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }
        //组3：使用entrySet
        Set entrySet=map.entrySet();
        //方法1：增强for
        for (Object o : entrySet){
            Map.Entry m=(Map.Entry) o;
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        //方法2：Iterator迭代器
        Iterator iterator2=entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry entry=(Map.Entry)next;
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
