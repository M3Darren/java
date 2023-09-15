package com.loy.sangeng_demo.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data

@NoArgsConstructor
public class LoginUser implements UserDetails {

    private User user;
//    保存用户的权限列表
    private List<String> permissions;
    public LoginUser(User user,List<String> permissions){
        this.user=user;
        this.permissions=permissions;
    }


    //    保存用户的权限列表（将字符串以及转换为SimpleGrantedAuthority对象）
    @JSONField(serialize = false)//设置该对象不序列化
    private List<GrantedAuthority> authenticateList;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        /**
         * 问题每次都会遍历权限列表
         * 期望：为空则遍历（第一次登录权限列表为空）
         */
        if(authenticateList!=null){
            return authenticateList;
        }
//        把权限列表permissions中的string封装成SimpleGrantedAuthority对象
         authenticateList = permissions.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
        return authenticateList;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
