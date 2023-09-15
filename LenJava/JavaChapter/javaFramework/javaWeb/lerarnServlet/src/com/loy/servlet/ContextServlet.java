package com.loy.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = getServletConfig().getServletContext();

        System.out.println("获取context-param参数：");
        System.out.println("username:"+servletContext.getInitParameter("username"));
        System.out.println("获取当前工程路径：");
        System.out.println("工程路径："+servletContext.getContextPath());
        System.out.println("获取工程在服务器硬盘上的绝对路径：");
        System.out.println(servletContext.getRealPath("/"));
        System.out.println("获取工程的css文件夹在服务器硬盘上的绝对路径：");
        System.out.println(servletContext.getRealPath("/css"));

        setContextData();
    }

//    演示servletcontext对象存取数据
    public void setContextData(){
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("key","this is key value");
        System.out.println("key:"+servletContext.getAttribute("key"));
    }
}
