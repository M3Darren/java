package com.loy.spb_web.controller;

import com.loy.spb_web.pojo.Cat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    @RequestMapping("/cat")
    public Cat testCat(Cat cat){
        System.out.println(cat.toString());
        return cat;
    }
}
