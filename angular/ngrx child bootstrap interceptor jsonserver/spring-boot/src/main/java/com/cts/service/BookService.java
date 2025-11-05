package com.cts.service;

import com.cts.dao.BookRepository;
import com.cts.exception.BookException;
import com.cts.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book addBook(Book book) throws BookException {
        if (repository.findById(book.getIsbn()).isPresent())
            throw new BookException("Book with id  " + book.getIsbn() + " is already present");

        log.info("book added "+book);
        return repository.save(book);
    }

    public Book searchBookByid(int id) throws BookException {
        if (repository.findById(id).isEmpty())
            throw new BookException("Book with id  " + id + " is not present");
        return repository.findById(id).get();
    }

    public Book updateBook(Book emp) throws BookException {
        if (repository.findById(emp.getIsbn()).isEmpty())
            throw new BookException("Book with id  " + emp.getIsbn() + " is not present");

        return repository.save(emp);
    }


    public Book removeBookById(int id) throws BookException {
        if (repository.findById(id).isEmpty())
            throw new BookException("Book with id  " + id + " is not present");

        var emp = repository.findById(id).get();
        repository.deleteById(id);
        return emp;
    }

    public List<Book> getAllBook() throws BookException {
        if (repository.findAll().isEmpty()) {
            throw new BookException("Book list is empty ");
        } else {
            return repository.findAll();
        }
    }

}
