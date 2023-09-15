package com.java_learn.alllist_.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class Map_RadeCode {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put(new Object(),new Object());
        map.put("1","12");
        map.put("1","12");
        map.put("1","12");
        Set set=map.entrySet();//entrySet易于管理和遍历
        for (Object obj : set){
            Map.Entry entry=(Map.Entry) obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        Set keyset=map.keySet();//将存入Node的key放入keySet；将value放入values
        System.out.println("keySet的运行类型："+keyset.getClass());
        Collection value=map.values();
        System.out.println("value的运行类型："+value.getClass());
        /*老韩解读
//1,k-v最后是HashMap$Nodenode=newNode(hash,key,valve,nuLL)
//2,k-v为了方便程序员的遍历，还会创建EntrySet集合，该集合存放的元素的类型Entry,而一个Entry
//对象就有k,v EntrySet<Entry<K,V>>即：transient Set<Map.Entry<K,V>>entrySet;
//3,entrySet中，定义的类型是Map.Entry,但是实际上存放的还是HashMap$Node
//这时因为static class Node<K,V>implements Map.Entry<K,V>
//4,当把HashMap$Node对象存放到entrySet就方便我们的遍历，因为Map.Entry提供了重要方法
     K getKey();V getValue();

         */
    }
}
