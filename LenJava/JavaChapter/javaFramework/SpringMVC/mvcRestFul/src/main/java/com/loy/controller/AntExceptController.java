package com.loy.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class AntExceptController {
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public String testAntExcept(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
