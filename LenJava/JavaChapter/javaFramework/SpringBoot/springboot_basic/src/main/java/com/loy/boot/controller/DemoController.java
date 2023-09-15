package com.loy.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/1")
    public String handleHello(){
        return "收到dsadsdsadsdaas辐射带动    奋斗奋斗 SpringBoot";
    }
}
