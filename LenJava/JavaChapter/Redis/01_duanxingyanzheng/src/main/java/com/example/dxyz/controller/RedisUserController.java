package com.example.dxyz.controller;

import com.example.dxyz.interceptor.UserThreadLocal;
import com.example.dxyz.pojo.User;
import com.example.dxyz.service.RedisUserService;
import com.example.dxyz.service.UserService;
import com.example.dxyz.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class RedisUserController {
    @Autowired
    private RedisUserService userService;

    @RequestMapping("/user/code")
    public ResponseResult loginUser(@RequestParam("phone") String phone){
        return userService.sendCode(phone);
    }

    @RequestMapping("/user/login")
    public ResponseResult loginOrRegister(User user,String code,HttpSession session){
        return  userService.login(user,code,session);
    }
    @RequestMapping("/onlineUser")
    public ResponseResult onLineUser(){
        User user = UserThreadLocal.getUser();
        return new ResponseResult(200,"在线用户",user);
    }
}
