package com.loy.spring.dao.impl;

import com.loy.spring.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public int getBookId() {
        return 1;
    }

    @Override
    public String getBookName() {
        return "huozhe";
    }
}
