package com.loy.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public abstract class BasicServlet extends HttpServlet {
//    抽取相同的业务模块：获取action，反射调用action对应的方法，其他servlet程序只需要继承此类即可

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);//使get与post都能使用反射操作方法
        System.out.println("发生get请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      （一定在获取请求之前）  解决响应乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        /**
         * 使用反射调用对应方法:
         * 获取表单中的隐藏域的action值
         * 使用反射调用对应方法
         */
        String action = req.getParameter("action");
        System.out.println(action);
        try {
            Method declaredMethod = this.getClass().getDeclaredMethod(action,HttpServletRequest.class,HttpServletResponse.class);
            declaredMethod.invoke(this,req,resp);
        } catch ( Exception e) {
           throw new RuntimeException();
        }

    }
}
