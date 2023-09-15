package com.loy.spring.service;

import com.loy.spring.dao.impl.BookDaoImpl;

public class BookService {
    private static BookDaoImpl bookDaoImpl;

    public void setBookDaoImpl(BookDaoImpl bookDaoImpl) {
        BookService.bookDaoImpl = bookDaoImpl;
    }

    public  void getBookInfo() {
        int bookId = bookDaoImpl.getBookId();
        String bookName = bookDaoImpl.getBookName();
        System.out.println("书名：" + bookName + "\nid：" + bookId);
    }
}