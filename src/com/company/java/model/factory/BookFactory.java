package model.factory;

import model.Book;

public class BookFactory implements EntityFactory<Book> {

    @Override
    public  Book createEntity() {
        return new Book();
    }

}
