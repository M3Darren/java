package com.loy.dao.impl;

import com.loy.dao.BasicDao;
import com.loy.dao.intf.BookDao;
import com.loy.dao.intf.PageDao;
import com.loy.pojo.Book;
import org.junit.Test;

import java.util.List;

public class BookImpl extends BasicDao<Book> implements BookDao, PageDao<Book> {
    @Override
    public int addBook(Book book) {
        String sql="insert into b_book values(null,?,?,?,?,?,?)";

        return update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getImgPath());
    }

    @Override
    public int deleteBook(int id) {
        String sql="delete from b_book where id=?";
        return update(sql,id);
    }

    @Override
    public int updateBook(Book book) {
        String sql="update b_book set name=?,author=?,price=?,sales=?,stock=?,imgPath=? where id=?";
        return update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getSales(),book.getStock(),book.getImgPath(),book.getId());
    }

    @Override
    public Book queryBookById(int id) {
        String sql="select * from b_book where id=?";
        return queryString(sql,Book.class,id);
    }

    @Override
    public List<Book> queryBookList() {
        String sql="select * from b_book";
        return queryMulti(sql,Book.class);
    }

    @Override
    public int queryForPageTotalCount() {
        Number totalCount = (Number) queryScalar("select count(*) from b_book");
        return  totalCount.intValue();
    }


    @Override
    public List<Book> queryForPageItems(int begin, int pageSize) {
        return queryMulti("select * from b_book  limit ?,?",Book.class,begin,pageSize);
    }
}
