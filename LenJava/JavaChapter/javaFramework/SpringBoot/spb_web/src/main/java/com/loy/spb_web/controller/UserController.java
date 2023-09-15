package com.loy.spb_web.controller;

import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@RestController
public class UserController {

    @RequestMapping("/user/{param}")
    public String getUser(@PathVariable Map<String,Object> map) {
        System.out.println(map);
        return map.toString();
    }

    @RequestMapping("/info/{nima}")
//    路径参数类似：/info/id=10;hobby=a,s,d
//    多路径参数出现重复问题：
//    /info/{obj1}/{obj2}
//    /info/1;age=12/2;age=21
//    此时使用如下格式区分：
//    @MatrixVariable(value="age",pathVar="obj1")
    public String getInfo( @MatrixVariable("hobby")List<String> hobby,@PathVariable("nima") String nima) {
        System.out.println(hobby);
        return nima;
    }

    //测试servlet api
    @RequestMapping("/test")
    public String getTest(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        return "true";
    }

    //测试map，model
    @RequestMapping("testMap")
    public String testMap(Map<String,Object> map){
        map.put("msg","hello");
        return map.toString();
    }
}
