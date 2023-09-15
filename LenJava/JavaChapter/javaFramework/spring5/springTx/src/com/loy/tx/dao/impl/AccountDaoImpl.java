package com.loy.tx.dao.impl;

import com.loy.tx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository(value = "accountDaoImpl")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int income(int id, double money) {
        String sql = "update acc set money=money+? where id=?";
        int update = jdbcTemplate.update(sql, money, id);
        return update;
    }

    @Override
    public int outcome(int id, double money) {
        String sql = "update acc set money=money-? where id=?";
        int update = jdbcTemplate.update(sql, money, id);
        return update;
    }
}
