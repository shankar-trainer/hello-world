package com.example.web;

import com.example.exception.BookException;
import com.example.model.Book;
import com.example.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        try {
            //return ResponseEntity.ok(bookService.getAllBooks());
            log.info("getAllBooks",bookService.getAllBooks(),HttpStatus.OK);
            return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
        } catch (BookException e) {
            log.error("getAllBooks "+e.getMessage()+"\tstatus code "+HttpStatus.NOT_FOUND);
//         return ResponseEntity.notFound(e.getMessage()).build();
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<Book> addBooks(@RequestBody  Book b) {
        try {
        log.info("addBook  controller",b);
            return new ResponseEntity<>(bookService.addBooks(b), HttpStatus.OK);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);

        }
    }

}
