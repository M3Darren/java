package com.loy.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyServlet implements Servlet {

    public MyServlet() {
        System.out.println("1.构造器方法执行！");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2.init初始化");
//        使用servletConfig获取别名
        System.out.println("该servlet程序的别名："+servletConfig.getServletName());
//        获取web.xml里的init-param
        System.out.println("获取该servlet程序下的init-param：");
        System.out.println("name值:"+servletConfig.getInitParameter("name"));
//        获取ServletContext
        System.out.println("ServletContext:"+servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 专门用于处理请求和响应的方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("3.MyServlet的service方法被访问了！");
//        判断请求类型
//        类型转换，使其能使用getMethod方法
        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;
        String method = httpServletRequest.getMethod();

//        为了提高代码可扩展性，使用自定义函数执行具体业务逻辑
        if("POST".equals(method)){
            System.out.println("当前发生post请求");
            doPost();
        }
        if ("GET".equals(method)){
            System.out.println("当前发生get请求");

            doGet();
        }
    }

    public void doGet(){
        System.out.println("doGet处理get请求业务逻辑");
    }
    public  void  doPost(){
        System.out.println("doPost处理post请求业务逻辑");
    }
    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4.destory方法被执行");
    }
}
