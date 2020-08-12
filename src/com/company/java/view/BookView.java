package view;

import controller.BookController;
import model.Book;
import model.factory.BookFactory;

import java.util.Scanner;

public class BookView {
    static Scanner scanner = new Scanner(System.in);
    BookController bookController = new BookController();

    public void showBookMenu() {
        System.out.println("Book");
        System.out.println("1 - Create Book");
        System.out.println("2 - Update Book");
        System.out.println("3 - Remove Book");
        System.out.println("4 - Get Book");


        Integer choice = -1;

        while (true) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createBookMenu();
                    break;

            }
        }
    }

    private void createBookMenu() {

       Book book = new Book();

        System.out.println("Crete Book");


        while (book.getIdBook() == null) {
            System.out.println("Enter book id");
            Long id = scanner.nextLong();
            if (bookController.getById(id).getIdBook() != null) {
                System.out.println("Такая книга уже есть");
            } else {
                book.setIdBook(id);
            }
        }

        while (book.getNameBook() == null || book.getNameBook().isBlank()){
            System.out.println("Enter book name");
            book.setNameBook(scanner.nextLine());
        }

        while (book.getAuthorBook() == null || book.getAuthorBook().isBlank()){
            System.out.println("Enter book author");
            book.setAuthorBook(scanner.nextLine());
        }

        bookController.save(book);

        System.out.println("Book");
        System.out.println("1 - Create Book");
        System.out.println("2 - Update Book");
        System.out.println("3 - Remove Book");
        System.out.println("4 - Get Book");
    }
}
