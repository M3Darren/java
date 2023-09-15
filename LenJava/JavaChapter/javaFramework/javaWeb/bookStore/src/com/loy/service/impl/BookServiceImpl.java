package com.loy.service.impl;

import com.loy.dao.impl.BookImpl;
import com.loy.dao.impl.PageUtils;
import com.loy.pojo.Book;
import com.loy.pojo.Page;
import com.loy.service.intf.BookService;
import org.junit.Test;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookImpl bookImpl = new BookImpl();

    @Override
    public int addBook(Book book) {

        return bookImpl.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookImpl.updateBook(book);
    }

    @Override
    public int deleteBook(int id) {
        return bookImpl.deleteBook(id);
    }

    @Override
    public List<Book> bookList() {
        return bookImpl.queryBookList();
    }

    @Override
    public Book findBookById(int id) {
        return bookImpl.queryBookById(id);
    }

    public Page<Book> page(int pageNo, int pageSize) {
        Page<Book> bookPage = new Page<>();
        Page page = PageUtils.pageT(bookPage, bookImpl, pageNo, pageSize);

        return page;
    }

}
