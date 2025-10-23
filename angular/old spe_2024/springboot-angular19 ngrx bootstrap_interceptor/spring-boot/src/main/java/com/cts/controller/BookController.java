package com.cts.controller;

import com.cts.exception.BookException;
import com.cts.model.Book;
import com.cts.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:4200/")
public class BookController {

    @Autowired
    private BookService service;


    @GetMapping("/Book")
    public ResponseEntity<List<Book>> getAllBook() {
        try {
            return new ResponseEntity<>(service.getAllBook(), HttpStatus.CREATED);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/Book/{id}")
    public ResponseEntity<Book> searchBookByid(@PathVariable int id){
        try {
            return new ResponseEntity<>(service.searchBookByid(id), HttpStatus.CREATED);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/Book")
    public ResponseEntity<Book> updateBook(@RequestBody Book emp) {
        try {
            return new ResponseEntity<>(service.updateBook(emp), HttpStatus.CREATED);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/Book/{id}")
    public ResponseEntity<Book> removeBookById(@PathVariable int id) {
        try {
            return new ResponseEntity<>(service.removeBookById(id), HttpStatus.CREATED);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/Book")
    public ResponseEntity<Book> addBook(@RequestBody Book emp) {
        try {
            return new ResponseEntity<>(service.addBook(emp), HttpStatus.CREATED);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
