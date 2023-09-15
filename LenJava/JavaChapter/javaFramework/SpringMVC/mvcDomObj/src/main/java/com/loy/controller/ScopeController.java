package com.loy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {
  /*  @RequestMapping("/")
    public String index() {

        return "index";
    }*/

    //向request域对象共享数据：
    @RequestMapping("/testRequestByServlet")
    public String testRequestByServlet(HttpServletRequest request) {
        //使用servlet api 向request对象共享数据
        request.setAttribute("requestScope", "data");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        //使用ModelAndView向request对象共享数据
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("mdv", "ModelAndView");
//        设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        //使用Model向request对象共享数据
        model.addAttribute("model","model");
        return "success";
    }
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map) {
        //使用Map向request对象共享数据
        map.put("map","map");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        //使用Map向request对象共享数据
        modelMap.addAttribute("modelMap","modelMap");
        return "success";
    }



    //向session域对象共享数据：
    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("sessionScope","session");
        return "success";
    }


    //向Application域对象共享数据：
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext context = session.getServletContext();
        context.setAttribute("applicationScope","application");
        return "success";
    }
}
