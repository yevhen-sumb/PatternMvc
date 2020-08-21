package model;

public class Book extends NamedEntity {
    String authorBook; //автор

    public Book() {
    }

    public Book(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() +
                "authorBook='" + authorBook + '\'' +
                "} ";
    }
}
