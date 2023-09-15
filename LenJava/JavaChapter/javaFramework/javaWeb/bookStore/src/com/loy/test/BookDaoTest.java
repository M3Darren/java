package com.loy.test;

import com.loy.dao.impl.BookImpl;
import com.loy.dao.intf.BookDao;
import com.loy.pojo.Book;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class BookDaoTest {
private BookDao bookDao=new BookImpl();
    @Test
    public void addBook() {
        bookDao.addBook(new Book(1,"活着","余华",new BigDecimal(77.42),132,111,null));
    }

    @Test
    public void deleteBook() {
        bookDao.deleteBook(1);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(2,"时间简史","霍金",new BigDecimal(322.21),332,111,null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(4));
    }

    @Test
    public void queryBookList() {
        List<Book> books = bookDao.queryBookList();
        for (Book book: books){
            System.out.println(book);
        }
    }

}