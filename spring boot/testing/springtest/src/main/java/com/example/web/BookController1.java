package com.example.web;

import com.example.dao.BookRepository;
import com.example.exception.BookException;
import com.example.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book1")
@Slf4j
public class BookController1 {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        if (bookRepository.findAll().isEmpty()) {
//            return new ResponseEntity(new BookException("list is empty"), HttpStatus.NOT_FOUND) ;
            throw new BookException("book list is empty");
        } else
            return new ResponseEntity<>(bookRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> addBooks(Book b) {
        if (bookRepository.findById(b.getIsbn()).isPresent())
            throw new BookException("book with isbn already present");
        else
            return new ResponseEntity<>(bookRepository.findById(b.getIsbn()).get(), HttpStatus.FOUND);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> searchById(@PathVariable int id) {
        if (bookRepository.findById(id).isEmpty()) {
            throw new BookException("book not found with id ");
        } else
            return new ResponseEntity<>(bookRepository.findById(id).get(), HttpStatus.OK);
    }
}
