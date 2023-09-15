package com.example.springboot.ant_fun.service;

import com.example.springboot.ant_fun.bean.User;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserService {
//    模拟数据库
    private final Map<Integer,User> users= new HashMap<>();

    public UserService() {
        this.users.put(1,new User(1,"zhangsan","男"));
        this.users.put(2,new User(2,"lisi","男"));
    }

    //    根据id查询用户
  public   Mono<User> getUserById(int id){
        return Mono.justOrEmpty(this.users.get(id));
    }

//    查询所有用户
   public Flux<User> getAllUser(){
return Flux.fromIterable(this.users.values());
    }

//    添加操作
   public Mono<Void> saveUser(Mono<User> user){
        return user.doOnNext(person->{
            //向map中添加
            int i = users.size()+ 1;
            users.put(i,person);
        }).thenEmpty(Mono.empty());
    }
}
