package com.loy.dao.intf;

import com.loy.pojo.Book;

import java.util.List;

public interface BookDao {
    public int addBook(Book book);
    public int deleteBook(int id);
    public int updateBook(Book book);
    public Book queryBookById(int id);
    public List<Book> queryBookList();
}
