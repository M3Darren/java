package com.loy.spb_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {

    @RequestMapping("ind")
    public String index(){
        return "login";
    }
    @PostMapping("/login")
    public String login(String username, String password, HttpSession session){
        if("zhangsan".equals(username) && "123".equals(password)){
            session.setAttribute("loginUser",username);
            return "redirect:/main";
        }else{
            return "login";
        }

    }

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/ex")
    public String ex(){
        int i=10/0;
        return "main";
    }
}
