package com.loy;



import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {
//    使用servlet api获取请求参数
    @RequestMapping("/targetServlet")
    public String servletTarget(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.printf(username);
        return "target";
    }
//控制器形参获取
@RequestMapping("/targetController")
public String controllerTarget(String username,String[] hobby){
    //多个同名参数使用数组存取
    System.out.printf(username,hobby);
    return "target";
}

    @RequestMapping("/targetReqparm")
    public String reqparmTarget(
            @RequestParam(value = "username",required = false,defaultValue = "hehe") String username, String[] hobby){
/**
 * @RequestParam，@RequestHeader，@CookieValue
 * value 指定请求参数为value值一致
 * required 默认true，请求必须传参为value的值，否则报错404
 * defaultValue 如果没有传递value的值的请求参数，使用默认值赋值给形参
 */
        System.out.printf(username,hobby);
        return "target";
    }

    @RequestMapping("/targetPojo")
    public String pojoTarget(User user){
        System.out.printf(user.toString());
        return "target";
    }

}
