package com.loy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "/")
    public String indexPage(){
        //返回的是资源名，除去前缀（/WEB-INF/templates/）与后缀(.html)
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
