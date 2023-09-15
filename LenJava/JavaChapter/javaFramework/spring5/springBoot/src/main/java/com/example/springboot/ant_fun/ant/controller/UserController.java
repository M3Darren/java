package com.example.springboot.ant_fun.ant.controller;

import com.example.springboot.ant_fun.bean.User;
import com.example.springboot.ant_fun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class UserController {
    //注入service
    @Autowired
    private UserService userService;
    //id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUser(@PathVariable int id){
        return userService.getUserById(id);
    }

//    查询所有用户
    @GetMapping("/allUser")
    public Flux<User> getAll(){
        return userService.getAllUser();
    }
    @PostMapping("/saveUser")
    public Mono<Void> save(@RequestBody User user){
        Mono<User> just = Mono.just(user);
        return userService.saveUser(just);
    }

}
