package com.loy.httpservletrequest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpServletReq extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        System.out.println("lessonName:"+req.getParameter("lessonName"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        当post请求参数值有中文会乱码，需要设置：
//        req.setCharacterEncoding("UTF-8");//在获取参数之前设置，不然会失效
        System.out.println("lessonName:"+req.getParameter("lessonName"));
    }
}
