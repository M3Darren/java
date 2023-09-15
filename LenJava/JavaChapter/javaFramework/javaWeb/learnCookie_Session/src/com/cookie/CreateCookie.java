package com.cookie;

import com.BasicServlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookie extends BasicServlet {
    public void createCookie(HttpServletRequest req,HttpServletResponse resp){
        resp.addCookie(new Cookie("key1","value1"));
        System.out.println("创建了cookie");
    }
    public void igetCookie(HttpServletRequest req,HttpServletResponse resp){
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName()+"===>"+cookie.getValue());
        }
    }
    public void updateCookie(HttpServletRequest req,HttpServletResponse resp){
        Cookie key1 = CookieUtils.findCookie("key1", req.getCookies());
        key1.setValue("newValue");
        resp.addCookie(key1);
        System.out.println(key1);
    }

    public void setCookiePath(HttpServletRequest req,HttpServletResponse resp){
        Cookie cookie = new Cookie("kk", "ll");
        cookie.setPath(req.getContextPath());
        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();
        System.out.println(cookies);
    }
}
