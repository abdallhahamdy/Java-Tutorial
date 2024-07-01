package Composition.Example_1;

import Composition.Example_1.Book;
import Composition.Example_1.Library;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.showBooks();
        // Output:
        // Title: 1984, Author: George Orwell
        // Title: To Kill a Mockingbird, Author: Harper Lee
    }
}
