package com.loy.httpservletrequest;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ForwardRequests01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("收到请求参数name："+name);
        req.setAttribute("forwardName","this is forward!");//Request域数据共享，所以FR02可通过该实例对象访问设置的forwardName属性
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/FR02");//将请求转发给FR02
        requestDispatcher.forward(req,resp);
    }
}
