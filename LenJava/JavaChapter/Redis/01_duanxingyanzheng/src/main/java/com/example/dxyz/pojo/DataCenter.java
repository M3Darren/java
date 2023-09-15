package com.example.dxyz.pojo;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class DataCenter {
    private static   Map map;
   static  {
       map=new HashMap<>();
        map.put("15527528193",new User(1,"zhangsan","15527528193"));
        map.put("13766234432",new User(2,"lisi","13766234432"));

    }
    public Map getMap(){
        return map;
    }
    public void insertUserMap(User user){
        map.put(user.getPhone(),user);
    }

    @Override
    public String toString() {
        return "DataCenter{" +
                "map=" + map +
                '}';
    }
}
