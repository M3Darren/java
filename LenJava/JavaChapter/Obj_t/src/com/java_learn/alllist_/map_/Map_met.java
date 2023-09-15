package com.java_learn.alllist_.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Map_met {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("a","pk");
        map.put("b","ok");
        map.put("c","ik");
        System.out.println(map.get("c"));
        //remove根据键删除对应的值
        map.remove("a");
        //get根据键获取对应的值
        map.get("b");
        //size判断map的大小
        map.size();
        //containsKey判断键是否存在
        //containsValue判断值是否存在
        System.out.println(map.containsKey("c"));
        map.containsValue("zhangsanfeng");
        //isEmpty判断map个数是否为0
        map.isEmpty();
    }
}
