package com.session;

import com.BasicServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CreateSession extends BasicServlet {
    public void createSession(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        boolean aNew = session.isNew();
        String id = session.getId();
        System.out.println("是否为新创建的："+aNew+"；\nid："+id);

    }
    public void setValue(HttpServletRequest req, HttpServletResponse resp){
        req.getSession().setAttribute("ke1","v1");
        System.out.println("设置ke1");
    }
    public void getValue(HttpServletRequest req, HttpServletResponse resp){
        Object ke1 = req.getSession().getAttribute("ke1");
        System.out.println(ke1);
    }
    public void deleteSession(HttpServletRequest req, HttpServletResponse resp){
        req.getSession().invalidate();
        System.out.println("session已经设置过期");
    }
}
