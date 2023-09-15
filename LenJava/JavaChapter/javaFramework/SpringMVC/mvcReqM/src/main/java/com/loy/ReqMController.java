package com.loy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReqMController {
@RequestMapping("/")
    public String index(){
        return "index";
    }
//使用params属性
    @RequestMapping(value = "/target",method = RequestMethod.GET,params = {"username"},headers = {"Host=localhost:8181"})
    public String taget(){
        return "target";
    }

//    使用占位符
    @RequestMapping(value = "/path/{id}/{username}")
    public String testPath(@PathVariable("id") String id,@PathVariable("username") String username){
        System.out.printf(id);
        return "target";
    }
}
