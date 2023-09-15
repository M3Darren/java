package com.loy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/testThyView")
    public String testThyView(){
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThyView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThyView";
    }
}
