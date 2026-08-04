package com.coforge.service;

import com.coforge.exception.BookException;
import com.coforge.model.Author;
import com.coforge.model.Book;
import com.coforge.model.Publisher;
import com.coforge.repository.AuthorRepository;
import com.coforge.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Set;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }


    public Book updateBook(Book book) {
        if (bookRepository.findById(book.getIsbn()).isEmpty())
            throw new BookException("book isbn not present");
        else
            return bookRepository.save(book);
    }

    public Book searchByBookId(long id) {
        if (bookRepository.findById(id).isEmpty())
            throw new BookException("book isbn not present");
        else
            return bookRepository.findById(id).get();
    }

    public Book deleteByBookId(long id) {
        Book book = null;
        if (bookRepository.findById(id).isEmpty())
            throw new BookException("book isbn not present");
        else {
            book = bookRepository.findById(id).get();
            bookRepository.deleteById(id);
            return book;
        }
    }


    public List<Book> showAllBooks() {
        if (bookRepository.findAll().isEmpty()) {
            throw new BookException("book list is empty");
        } else
            return bookRepository.findAll();
    }


}
