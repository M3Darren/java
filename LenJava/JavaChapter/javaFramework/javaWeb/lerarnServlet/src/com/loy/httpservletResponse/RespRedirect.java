package com.loy.httpservletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RespRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("接收到请求1了，开始设置重定向");
//        重定向方式：
//        方式一：
//        resp.setStatus(302);
//        resp.setHeader("Location","http://localhost:8181/learn/RR2");
//        方式二：
        resp.sendRedirect("http://localhost:8181/learn/RR2");

    }
}
