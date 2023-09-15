package com.loy.shcxhc.pojo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class DataCenter {
    private static Map map;
    static {
        map=new HashMap<>();
        map.put(1,new User(1,"zhangsan","这是张三的店铺"));
        map.put(2,new User(2,"lisi","这是李四的店铺"));
    }
    public Map getMap(){
        return map;
    }
}
