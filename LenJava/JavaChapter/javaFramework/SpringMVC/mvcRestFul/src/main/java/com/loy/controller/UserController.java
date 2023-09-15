package com.loy.controller;

import com.loy.dao.UserDao;
import com.loy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView showUser() {
        ModelAndView mv = new ModelAndView();
        Collection<User> allUser = userDao.getAllUser();
        mv.addObject("userList", allUser);
        mv.setViewName("target");
        return mv;
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Integer id) {

        userDao.delete(id);

        return "redirect:/user";
    }
    @RequestMapping("/add")
    public String addUser(){
        return "save";
    }
    @RequestMapping("/upd/{id}")
    public ModelAndView updateUser(@PathVariable("id") Integer id){
        User user = userDao.getUserById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("save");
        return modelAndView;
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String save(User user){
        userDao.saveUser(user);
        return "redirect:/user";
    }




}
