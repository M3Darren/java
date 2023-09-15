package com.loy.sangeng_demo.service.impl;

import com.loy.sangeng_demo.domain.LoginUser;
import com.loy.sangeng_demo.domain.ResponseResult;
import com.loy.sangeng_demo.domain.User;
import com.loy.sangeng_demo.service.LoginService;
import com.loy.sangeng_demo.utils.JwtUtil;
import com.loy.sangeng_demo.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    RedisCache redisCache;
    @Override
    public ResponseResult login(User user) {
//        使用AuthenticationManager的authenticate方法进行用户认证
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword());
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

//        认证没通过：给出相应提示
if(Objects.isNull(authenticate)){
    throw new RuntimeException("登录失败");
}
//        认证通过：使用userid生成jwt
        LoginUser principal = (LoginUser) authenticate.getPrincipal();
//        获取用户id
        Long id = principal.getUser().getId();
        String jwt = JwtUtil.createJWT(String.valueOf(id));
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("token",jwt);
        //                将完整的用户信息存入redis，userid作为key，信息作为value
        redisCache.setCacheObject("userId:"+id,principal);
        return new ResponseResult(200,"登录成功",hashMap);
    }

    @Override
    public ResponseResult logout() {
//        获取SecurityContextHolder中用户id
        UsernamePasswordAuthenticationToken authentication = (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        LoginUser principal = (LoginUser) authentication.getPrincipal();
        Long id = principal.getUser().getId();
//        删除redis中的值
        redisCache.deleteObject("userId:"+id);
        return new ResponseResult(200,"注销成功");
    }

}
