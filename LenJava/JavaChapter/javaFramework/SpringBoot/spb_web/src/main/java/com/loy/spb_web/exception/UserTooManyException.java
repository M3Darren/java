package com.loy.spb_web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN,reason = "当前用户过多")
public class UserTooManyException extends RuntimeException{
    public UserTooManyException(String message) {
        super(message);
    }
    public UserTooManyException() {
    }
}
