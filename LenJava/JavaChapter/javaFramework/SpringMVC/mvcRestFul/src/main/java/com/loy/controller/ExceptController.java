package com.loy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptController {

    @RequestMapping("/testExcept")
    public String testExcept(){
        int i=1/0;
        return "index";
    }
}


