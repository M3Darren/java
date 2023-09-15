package com.loy.mybatis.mapper;

import com.loy.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSqlMapper {
//    模糊查询
    List<User> selectLike(@Param("param") String param);

//    批量删除
    int deleteSomeUser(@Param("ids") String ids);

//    动态表名（分表）
    List<User> getUserByTable(@Param("tableName") String tableName);

//    获取自增主键值
    int getAutoKey(User user);
}
