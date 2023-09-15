package com.loy.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.loy.mybatisplus.mapper.UserMapper;
import com.loy.mybatisplus.pojo.User;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyBatisPlusPagingTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPaging() {
//            分页
        Page<User> userPage = new Page<User>(1,4);
        userMapper.selectPage(userPage,null);
        System.out.println(userPage.getPages());//总页数
        System.out.println(userPage.getTotal());//总记录数
        System.out.println(userPage.getRecords());//当前页的数据
        System.out.println(userPage.hasNext());//是否有下一页
        System.out.println(userPage.hasPrevious());//是否有上一页
    }

    @Test
    public void testPagingForMe(){
        Page<User> userPage = new Page<>(1,4);
        Page<User> page = userMapper.selectPageVo(userPage, 20);
        System.out.println(page.getRecords());
    }
}
