package com.coforge.web;

import com.coforge.exception.BookException;
import com.coforge.model.Book;
import com.coforge.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "http://localhost:4200/")
//@CrossOrigin(value = "http://localhost:3000/")

public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        try {
//            return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
            return new ResponseEntity<>(bookService.addBook(book), HttpStatus.FOUND);

        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    @PutMapping("/book")
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        try {
            return new ResponseEntity<>(bookService.updateBook(book), HttpStatus.CREATED);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> searchByBookId(@PathVariable long id) {
        try {
            return new ResponseEntity<>(bookService.searchByBookId(id), HttpStatus.FOUND);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<Book> deleteByBookId(@PathVariable long id) {
        try {
            return new ResponseEntity<>(bookService.deleteByBookId(id), HttpStatus.FOUND);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/book")
    public ResponseEntity<List<Book>> showAllBooks() {
        try {
//            return new ResponseEntity<>(bookService.showAllBooks(), HttpStatus.FOUND);
            return new ResponseEntity<>(bookService.showAllBooks(), HttpStatus.OK);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
