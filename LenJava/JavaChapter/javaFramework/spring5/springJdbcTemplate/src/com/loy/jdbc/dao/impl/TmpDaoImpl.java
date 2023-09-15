package com.loy.jdbc.dao.impl;

import com.loy.jdbc.bean.Tmp;
import com.loy.jdbc.dao.TmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TmpDaoImpl implements TmpDao {
//    注入jdbc
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //数据库操作：
    public void add(Tmp tmp){
        String sql="insert into tmp values(null,?)";
        int update = jdbcTemplate.update(sql, tmp.getName());
        System.out.println(update);
    }

    @Override
    public void del(int id) {
        String sql="delete from tmp where id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public void upd(Tmp tmp) {
String sql="update tmp set name=? where id=?";
        int update = jdbcTemplate.update(sql, tmp.getName(), tmp.getId());
        System.out.println(update);
    }

    @Override
    public List<Tmp> sel() {
String sql="select * from tmp";
        List<Tmp> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Tmp.class));
        return list;
    }

    @Override
    public Tmp findTmpById(int id) {
        String sql="select * from tmp where id=?";
        Tmp tmp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Tmp.class), id);
        return tmp;
    }
}
