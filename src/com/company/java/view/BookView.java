package view;

import controller.BookController;
import model.Book;
import model.factory.BookFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class BookView {
    static Scanner scanner = new Scanner(System.in);
    BookController bookController = new BookController();

    public void showBookMenu() {
        System.out.println("Book");
        System.out.println("1 - Create book");
        System.out.println("2 - Find a book");
        System.out.println("3 - View all books");



        Integer choice = -1;

        while (true) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createBookMenu();
                    break;
                case 2:
                    findBookMenu();
                case 3:
                    getAllBooks();

            }
        }
    }


    private void createBookMenu() {

       Book book = new Book();

        System.out.println("Crete Book");

        while (book.getId() == null) {
            System.out.println("Enter book id");
            Long id = scanner.nextLong();
            if (bookController.getById(id).getId() != null) {
                System.out.println("Такая книга уже есть");
            } else {
                book.setId(id);
            }
        }

        System.out.println("Enter book name");
        while (book.getName() == null || book.getName().isBlank()){
            book.setName(scanner.nextLine());
        }

        while (book.getAuthorBook() == null || book.getAuthorBook().isBlank()){
            System.out.println("Enter book author");
            book.setAuthorBook(scanner.nextLine());
        }

        bookController.save(book);

        System.out.println("Book");
        System.out.println("1 - Create Book");
        System.out.println("2 - Find a book");
        System.out.println("3 - View all Book");
    }

    public void findBookMenu(){
        System.out.println("Finding book");
        System.out.println("Enter id book to start research");
        Long id = scanner.nextLong();
        Book book = bookController.getById(id);
        if(book.isNew()){
            System.out.println("This book is not");
        } else {
            System.out.println(book);
        }

        System.out.println("Book");
        System.out.println("1 - Create Book");
        System.out.println("2 - Find a book");
        System.out.println("3 - View all Book");
    }
    private void getAllBooks() {

        ArrayList<Book> books = (ArrayList<Book>) bookController.getAllBooks();

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Book");
        System.out.println("1 - Create Book");
        System.out.println("2 - Find a book");
        System.out.println("3 - View all Book");
    }

}
