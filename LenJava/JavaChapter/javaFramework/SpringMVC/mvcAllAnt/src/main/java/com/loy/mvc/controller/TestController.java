package com.loy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        int i=10/0;
        return "index";
    }
}
