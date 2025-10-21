package com.example.service;


import com.example.dao.BookRepository;
import com.example.exception.BookException;
import com.example.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Slf4j
//@SpringBootTest
@DataJpaTest
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllBooks1() {
        Mockito.when(bookRepository.findAll()).thenThrow(new BookException("list is empty"));
//        Assertions.assertThrows(BookException.class, () -> bookService.getAllBooks());
        BookException bookException = Assertions.assertThrows(BookException.class, () -> bookService.getAllBooks());
        Assertions.assertEquals(bookException.getMessage(), "list is empty");
    }

    @Test
    public void getAllBooks() {

        Book book1 = Book.builder().bname("book1").cost(1200).build();
        Book book2 = Book.builder().bname("book2").cost(1100).build();

        Mockito.when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        List<Book> allBooks = bookService.getAllBooks();
        log.info("getAllBooks ", allBooks.get(0), allBooks.get(1));
        Assertions.assertEquals(2, allBooks.size());
        Assertions.assertEquals(book1, allBooks.get(0));
        Assertions.assertEquals(book2, allBooks.get(1));

        Assertions.assertEquals(book1.getCost(), 1200);
        Assertions.assertEquals(book2.getCost(), 1100);

        Assertions.assertEquals(book1.getBname(), "book1");
        Assertions.assertEquals(book2.getBname(), "book2");
    }

    @Test
    public void searchByIdTest() throws Exception {
        Mockito.when(bookRepository.findById(101)).thenThrow(new BookException("Book not found with id 101"));
        BookException bookException = Assertions.assertThrows(BookException.class, () -> bookService.searchBookById(101));
        Assertions.assertEquals(bookException.getMessage(), "Book not found with id 101");
        Assertions.assertTrue(bookException.getMessage().equals("Book not found with id 101"));
    }


    @Test
    public void searchByIdTest1() throws Exception {
        Book book1 = Book.builder().isbn(1001).bname("book1").cost(1200).build();
        bookService.addBooks(book1);
        Mockito.when(bookRepository.findById(1001)).thenReturn(Optional.of(book1));

        Book book = bookService.searchBookById(1001);
        Assertions.assertEquals(book.getBname(), "book1");
        Assertions.assertEquals(book.getCost(), 1200);
    }

    @Test
    public void searchByIdTest2() throws Exception {
        log.info("search by Id Test2");
        Book book1 = Book.builder().isbn(1001).bname("book1").cost(1200).build();
        bookService.addBooks(book1);
//        int isbn = bookService.getAllBooks().get(0).getIsbn();
        //Mockito.when(bookRepository.save(book1)).thenReturn(book1);
//        log.info("all books size "+ bookRepository.findAll().size());
//          log.info("all books size.. "+ bookService.getAllBooks().size());

        bookRepository.findAll().forEach(a -> log.info(String.valueOf(a)));

//        Book book = bookService.searchBookById(1001);
    }
}
