package org.example.book;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryImplTest {

    @Test
    void should_save_book_correctly() throws NoSuchFieldException, IllegalAccessException {
        //given
        int id = 1;
        BookRepository bookRepository = new BookRepositoryImpl();
        Book book = new Book(id, "Title", "Author");

        //when
        bookRepository.save(book);

        //then
        Map<Integer, Book> bookMap = extractUnderlyingBooksMap(bookRepository);
        Book book1 = bookMap.get(id);
        assertEquals(book, book1);
    }

    private Map<Integer, Book> extractUnderlyingBooksMap(BookRepository bookRepository) throws NoSuchFieldException, IllegalAccessException {
        Field bookField = bookRepository.getClass().getDeclaredField("books");
        bookField.setAccessible(true);
        Map<Integer, Book> integerBookMap = (Map<Integer, Book>) bookField.get(bookRepository);
        return integerBookMap;
    }
}