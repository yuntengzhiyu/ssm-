package com.service;

import com.dao.BookMapper;
import com.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public BookServiceImpl() {
    }

    public int addBook(Books book){
        return bookMapper.addBook(book);
    }

    //根据id删除一个Book
    public int deleteBookById(int id){
        return bookMapper.deleteBookById(id);
    }

    //更新Book
    public int updateBook(Books books){
        return bookMapper.updateBook(books);
    }

    //根据id查询,返回一个Book
    public Books queryBookById(int id){
        return bookMapper.queryBookById(id);
    }

    //查询全部Book,返回list集合
    public List<Books> queryAllBook(){
        return bookMapper.queryAllBook();
    }

}
