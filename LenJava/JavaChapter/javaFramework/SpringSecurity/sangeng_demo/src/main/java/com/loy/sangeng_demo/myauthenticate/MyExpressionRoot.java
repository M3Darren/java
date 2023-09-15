package com.loy.sangeng_demo.myauthenticate;

import com.loy.sangeng_demo.domain.LoginUser;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("ex")
public class MyExpressionRoot {
    //此处定义的名字不同，
    /**
     * 若与框架的hasAuthority相同
     * 使用语法：@PreAuthorize("@ex.hasAuthority('test')")
     */

    public boolean hasMyAuthenticate(String authority){
//        获取当前用户的权限
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser principal = (LoginUser) authentication.getPrincipal();
        List<String> permissions = principal.getPermissions();
//        判断用户权限集合中是否有该权限
        return permissions.contains(authority);
    }
}
