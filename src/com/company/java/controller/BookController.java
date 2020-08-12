package controller;

import dao.BookDaoIml;
import model.Book;

public class BookController {

    BookDaoIml bookDao = new BookDaoIml();

    public void save(Book book){
        bookDao.save(book);
    }

    public void update(Book book){
        bookDao.update(book);
    }

    public void remove(Book book){
        bookDao.remove(book);
    }


    public Book getById(Long id){
       return bookDao.getById(id);
    }
}
