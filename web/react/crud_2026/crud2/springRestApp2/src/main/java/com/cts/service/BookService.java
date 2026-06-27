package com.cts.service;

import com.cts.dao.BookRepository;
import com.cts.exception.BookException;
import com.cts.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book b) {
        return bookRepository.save(b);
    }



    public Book updateBook(Book b) {
        Optional<Book> byId = bookRepository.findById(b.getIsbn());
        if (byId.isPresent()) {
            return bookRepository.save(b);
        } else
            throw new BookException("book not present with isbn " + b.getIsbn());
    }

    public List<Book> getAllBook() {
        if (bookRepository.findAll().size() == 0)
            throw new BookException("book list is empty ");
        else
            return bookRepository.findAll();
    }

    public Book searchBookById(long id) {
        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isEmpty())
            throw new BookException("book not present with isbn " + id);
        return bookRepository.findById(id).get();
    }

    public Book deleteBookById(long id) {
        Book b1;
        Optional<Book> byId = bookRepository.findById(id);
        if (byId.isEmpty())
            throw new BookException("book not present with isbn " + id);
        else {
            b1 = byId.get();
            bookRepository.deleteById(id);
        }
        return b1;
    }


}
