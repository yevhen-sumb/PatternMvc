package dao;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDaoIml implements GenericDAO<Book, Long> {
    private List<Book> books = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book);
    }

    @Override
    public void update(Long id, Book book) {
        books.set(Math.toIntExact(id), book);
    }

    @Override
    public void remove(Book book) {
        books.remove(book);
    }

    @Override
    public Book getById(Long id) {
        return books.get(Math.toIntExact(id));
    }

    @Override
    public List<Book> getAll() {
        return books;
    }
}
