package com.example.service;

import com.example.dao.BookRepository;
import com.example.exception.BookException;
import com.example.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
Logger  logger = LoggerFactory.getLogger(BookService.class);

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
            logger.info("Getting all books" );
        if(bookRepository.findAll().size()==0) {
              logger.error("No books found");
            throw new BookException("list is empty");
        }
        else {
            logger.info("Found all books",bookRepository.findAll());
            return bookRepository.findAll();
        }
    }

    public Book addBooks(Book b) {
//        if(bookRepository.findById(b.getIsbn())!=null)
//            throw new BookException("is already ");
//        else
      logger.info("addBook service ",b);
        return bookRepository.save(b);
    }

    public Book searchBookById(int id) {
        logger.info("searchBookById service ",id);
       return bookRepository.findById(id).orElseThrow(()->new BookException("Book not found with id "+id));

    }
}
