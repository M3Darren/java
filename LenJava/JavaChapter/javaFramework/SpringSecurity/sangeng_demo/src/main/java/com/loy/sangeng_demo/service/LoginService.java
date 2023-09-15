package com.loy.sangeng_demo.service;

import com.loy.sangeng_demo.domain.ResponseResult;
import com.loy.sangeng_demo.domain.User;

public interface LoginService {
    ResponseResult login(User user);


    ResponseResult logout();
}
