package com.loy.test;

import com.loy.utils.JdbcUtilsByDruid;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class Test01 {
    @Test
    public void test() throws SQLException {
        Connection connection = JdbcUtilsByDruid.getConnection();
        System.out.println(connection);
    }
}
