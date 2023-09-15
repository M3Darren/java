package com.loy.service.intf;

import com.loy.pojo.Book;

import java.util.List;

public interface BookService {
    public int addBook(Book book);
    public int updateBook(Book book);
    public int deleteBook(int id);
    public List<Book> bookList();
    public Book findBookById(int id);
}
