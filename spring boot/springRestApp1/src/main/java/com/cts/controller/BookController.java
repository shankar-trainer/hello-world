package com.cts.controller;

import com.cts.exception.BookException;
import com.cts.model.Author;
import com.cts.model.Book;
import com.cts.model.Chapters;
import com.cts.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class BookController {

//    @Autowired
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/chapter")
    public ResponseEntity<Chapters> addChapters(@RequestBody Chapters  chapters) {
        try {
            log.info("add chapters controller called "+chapters.toString());
           return  new ResponseEntity<Chapters>(bookService.addChapters(chapters), HttpStatus.CREATED);
        } catch (BookException e) {
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/author")
    public ResponseEntity<Author> addAuthor(@RequestBody Author b) {
        try {
           return  new ResponseEntity<Author>(bookService.addAuthor(b), HttpStatus.CREATED);
        } catch (BookException e) {
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody Book b) {
        try {
           return  new ResponseEntity<Book>(bookService.addBook(b), HttpStatus.CREATED);
        } catch (BookException e) {
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/book")
    public ResponseEntity<Book> updateBook(@RequestBody Book b) {
        try {
            return new ResponseEntity<>(bookService.updateBook(b),HttpStatus.CREATED);
        } catch (BookException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<Book> deleteBookById(@PathVariable long id) {
        try {
            return new ResponseEntity<>(bookService.deleteBookById(id),HttpStatus.OK);
        } catch (BookException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }


    // Get http://localhost:8082/book/2
    @RequestMapping("/book/{id}")
    public ResponseEntity<Book> searchBookById(@PathVariable long id) {

        try {
            return new ResponseEntity<>(bookService.searchBookById(id),HttpStatus.FOUND);
        } catch (BookException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }


    //GET    http://localhost:8082/book?id=2
//    @GetMapping("/book1")
//    public Book searchBookById1(@RequestParam long id) {
//        return bookService.searchBookById(id);
//    }

    @RequestMapping("/book")
    public ResponseEntity<List<Book>> getAllBook() {
        try {
            return new ResponseEntity<>(bookService.getAllBook(),HttpStatus.FOUND);
        } catch (BookException e){
            return  new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}
