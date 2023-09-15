package com.loy.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class TestDruid {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testDruid(){


        System.out.println("数据源类型"+dataSource.getClass());
    }
}
