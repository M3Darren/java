package com.loy.web;

import com.loy.pojo.User;
import com.loy.service.impl.UserServiceImpl;
import com.loy.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

public class UserServlet extends BasicServlet {
    //优化登录注册模块代码，一个模块尽量使用一个servlet
    private UserServiceImpl userService = new UserServiceImpl();
    /**
     * 处理登录业务
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String message=null;
        System.out.println(username);
        if(userService.login(username,password)!=null){
            message="登录成功";
        }else{
            message="登录失败";
        }
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write(message);
    }

    /**
     * 处理注册业务
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      获取注册信息
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
//        验证信息合法性

        String data=null;

        if(!userService.existsUser(username) && password!=null && email!=null){
//            User user = new User(username,password,email);

//            使用BeanUtils工具类，将参数注入到对应bean中
            User user = WebUtils.copyParamToBean(req,new User());
            
            userService.registerUser(user);
            data="注册成功";

        }else{
            data="注册失败";

        }

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write(data);
    }

}
