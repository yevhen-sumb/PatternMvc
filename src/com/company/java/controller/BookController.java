package controller;

import dao.BookDaoIml;
import model.Book;

import java.util.List;

public class BookController {

   private BookDaoIml bookDao = new BookDaoIml();

    public void save(Book book){
        bookDao.save(book);
    }

    public void update(Long id, Book book){
        bookDao.update(id, book);
    }

    public void remove(Book book){
        bookDao.remove(book);
    }


    public Book getById(Long id){
        try {
            return bookDao.getById(id);
        } catch (Exception e) {
            System.out.println("Такого id еще нет");
        }
        return new Book();
    }

    public List<Book> getAllBooks(){
       return bookDao.getAll();
    }
}
