package com.loy.ajax;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loy.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        System.out.println("接收到ajax请求");
        Person person = new Person("zhangsan", "nan");
        Gson gson = new Gson();
        String gsonJson = gson.toJson(person);
        resp.getWriter().write(gsonJson);

    }
}
