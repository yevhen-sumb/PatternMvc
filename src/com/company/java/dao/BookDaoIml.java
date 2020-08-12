package dao;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoIml implements GenericDAO<Book, Long> {
    List<Book> books = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book);
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void remove(Book book) {

    }

    @Override
    public Book getById(Long id) {
        return books.get(Math.toIntExact(id));
    }
}
