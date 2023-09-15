package com.loy.service.impl;

import com.loy.dao.impl.UserImpl;
import com.loy.pojo.User;
import com.loy.service.intf.UserService;

public class UserServiceImpl implements UserService {
   private UserImpl userimpl = new UserImpl();


    @Override
    public void registerUser(User user) {
        userimpl.saveUser(user);
    }

    @Override
    public User login(String username,String password) {
        return userimpl.queryUserByUsernameAndPassword(username,password);
    }

    /**
     * 检查用户是否存在
     * @param username
     * @return
     */
    @Override
    public boolean existsUser(String username) {
        if(userimpl.queryUserByUsername(username)==null){
            return false;
        }
        return true;
    }
}
