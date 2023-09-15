package com.loy.mybatis.mapper;

import com.loy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface ParamMapper {
//  使用参数传递进行操作数据库
//     注册功能
   int registerUser(String username,String passwd);
   int registerUserParam(@Param("name") String username,@Param("passwd") String passwd);
//   退出功能
User checkLoginUser(Map<String, Object> map);

int insertUser(User user);

//获取用户总数
   int countUser();
}
