package com.loy.dao;

import com.loy.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class UserDao {
    private static Map<Integer, User> userMap;
    private static Integer initId=1009;
    static {
        userMap=new HashMap<>();
        userMap.put(1,new User(1,"张三","北京","122344332"));
        userMap.put(2,new User(2,"李四","上海","1432343222"));
        userMap.put(3,new User(3,"王五","天津","1343243233"));
    }

    public Collection<User> getAllUser(){
        return userMap.values();
    }
    public User getUserById(Integer id){
        return userMap.get(id);
    }
    public void delete(Integer id){
        userMap.remove(id);
    }

    //添加和修改用户
    public void saveUser(User user){
        if(user.getId()==null){
            user.setId(initId++);
        }
        userMap.put(user.getId(),user);
    }
}
