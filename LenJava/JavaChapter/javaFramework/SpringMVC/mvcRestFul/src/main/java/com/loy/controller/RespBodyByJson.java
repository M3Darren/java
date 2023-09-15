package com.loy.controller;

import com.loy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class RespBodyByJson {
//    使用@ResponseBody处理json

    @RequestMapping("/respBody")
    @ResponseBody
    public User respBody(){
        return new User(1,"zz","shag","1223321");
    }
}
