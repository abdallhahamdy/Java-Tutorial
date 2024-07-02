package Cohesion.Example_2;

import java.util.List;

public class LibraryCatalog {
    private List<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
