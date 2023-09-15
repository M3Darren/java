package com.loy.service.intf;

import com.loy.pojo.User;

public interface UserService {
    public void registerUser(User user);
    public User login(String username,String password);
    public boolean existsUser(String username);
}
