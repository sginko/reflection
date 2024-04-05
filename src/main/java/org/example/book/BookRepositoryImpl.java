package org.example.book;

import java.util.HashMap;
import java.util.Map;

public class BookRepositoryImpl implements BookRepository {
    private Map<Integer, Book> books;

    public BookRepositoryImpl() {
        this.books = new HashMap<>();
    }

    @Override
    public void save(Book book) {
        books.put(book.getId(), book);
        System.out.println("Book saved: " + book.getTitle());
    }


}
