package com.loy.demo.controller;

import com.loy.demo.domain.Users;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/test/index")
    public String indexTest() {
    return "index";
    }
    @RequestMapping("/admin/user")
    public String admin(){
        return "Admin User List";
    }

    @RequestMapping("/test1")
    @Secured({"ROLE_manager","admin"})//当主体有该角色则可以访问
    public String test1(){
        return "test1";
    }

    @RequestMapping("/test2")
    @PreAuthorize("hasAnyAuthority('admin')")
    public String test2(){
        return "test2";
    }

    @RequestMapping("/test3")
    @PostAuthorize("hasAuthority('admin')")
    public String test3(){
        return "test3";
    }

    @RequestMapping("/test4")
    @PostFilter("filterObject.name='zhangsan'")//此时只返回name为zhangsan的数据
    public List<Users> test4(){
        ArrayList<Users> users = new ArrayList<>();
        users.add(new Users(1,"lisi","11211"));
        return users;
    }
}