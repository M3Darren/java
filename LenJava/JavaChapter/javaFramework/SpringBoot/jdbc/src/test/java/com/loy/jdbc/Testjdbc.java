package com.loy.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class Testjdbc {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void  testJdbc(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from test");
        System.out.println(maps);
    }
}
