package org.example.controller;

import lombok.Data;
import org.example.dao.BookDao;
import org.example.dao.BookDaoImpl;
import org.example.exception.BookException;
import org.example.model.Book;
import org.example.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by shankar on 4/20/2023.
 */
@RestController
@RequestMapping("/")
@Data
public class BookController {

    @Autowired
    BookServiceImpl bookService;

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBook(){
        try {
            return new ResponseEntity<List<Book>>(bookService.getAllBook(), HttpStatus.OK);
        }
        catch(BookException e){
            return new ResponseEntity(e.getMessage(), HttpStatus.OK);
        }
    }


    @DeleteMapping("/delete/{isbn}")
    public ResponseEntity<Book> deleteBook(@PathVariable("isbn") int isbn)
    {
        try {
            return  new ResponseEntity<Book>(bookService.removeBook(isbn), HttpStatus.OK);
        } catch (BookException e) {
            return  new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
        @GetMapping("/search/{isbn}")
    public ResponseEntity<Book> searchBook(@PathVariable("isbn") int isbn){
        try {
            return  new ResponseEntity<Book>(bookService.searchBook(isbn), HttpStatus.OK);
        } catch (BookException e) {
            return  new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


    @PostMapping("/add")
    public ResponseEntity<Book> addBook(@RequestBody Book b){

        try {
            return  new ResponseEntity<Book>(bookService.addBook(b), HttpStatus.CREATED);
        } catch (BookException e) {
            return  new ResponseEntity(e.getMessage(), HttpStatus.FOUND);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(@RequestBody Book b){
        try {
            return  new ResponseEntity<Book>(bookService.updateBook(b), HttpStatus.OK);
        } catch (BookException e) {
            return  new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
