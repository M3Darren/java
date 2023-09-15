package com.loy.spb_web.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@ControllerAdvice
public class GlobalException {
    //处理web controller异常

@ExceptionHandler({ArithmeticException.class, NullPointerException.class})//可处理的异常
    public String handleArithmeticException(Exception e, HttpServletRequest request){
      log.error("异常："+e);
      request.setAttribute("ex",e);
        return "/error/log";
    }
}
