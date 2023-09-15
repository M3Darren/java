package com.loy.sangeng_demo.controller;

import com.loy.sangeng_demo.domain.ResponseResult;
import com.loy.sangeng_demo.domain.User;
import com.loy.sangeng_demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;
    @RequestMapping("/user/login")
    public ResponseResult loginUser(User user){
        //登录
       return loginService.login(user);
    }
    @RequestMapping("/test")
    @PreAuthorize("hasAuthority('test')")
    public String test(){
        return "这是一个需要登录后才能访问的页面";
    }
    @RequestMapping("/user/logout")
    @PreAuthorize("hasAuthority('sys:admin:user')")
    public ResponseResult logOut( ){
        return loginService.logout();
    }
}
