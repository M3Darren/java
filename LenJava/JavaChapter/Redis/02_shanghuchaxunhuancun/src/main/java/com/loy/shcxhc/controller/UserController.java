package com.loy.shcxhc.controller;

import com.loy.shcxhc.service.UserService;
import com.loy.shcxhc.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("{id}")
    public ResponseResult selectUserById(@PathVariable("id") Long id){
        return userService.selectUserById(id);
    }

    @RequestMapping("update/{id}")
    public ResponseResult updateUserById(@PathVariable("id") Long id){
        return userService.updateUserById(id);
    }
}
