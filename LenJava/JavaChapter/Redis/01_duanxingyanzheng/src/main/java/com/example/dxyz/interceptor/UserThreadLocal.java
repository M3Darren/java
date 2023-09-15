package com.example.dxyz.interceptor;

import com.example.dxyz.pojo.User;

public class UserThreadLocal {
    private static final ThreadLocal<User> t1= new ThreadLocal();
    public static void saveUser(User userId){
        t1.set(userId);
    }
    public static User getUser(){
        return t1.get();
    }
    public static  void removeUser(){
        t1.remove();
    }

}
