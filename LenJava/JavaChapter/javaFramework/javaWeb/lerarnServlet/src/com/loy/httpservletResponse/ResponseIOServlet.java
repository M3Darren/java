package com.loy.httpservletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ResponseIOServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        向客户端回传字符串
//        设置服务器响应数据字符集
//        resp.setCharacterEncoding("UTF-8");
//        通过响应头，设置浏览器字符集
//        方法1：
//        resp.setHeader("Content-Type","text/html;charset=UTF-8");
//        方法2：需要注意该方法需要在获取流前设置，否则会失效
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
        writer.write("请求返回成功succsee");
    }
}
