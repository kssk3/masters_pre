package test.case2;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Library {

    List<Book> books = new LinkedList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooks() {
        return books;
    }

    public void changeBooks(int number, Book newBook) {
        books.set(number, newBook);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Library library = (Library) object;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
