package com.coforge.web;

import com.coforge.exception.BookException;
import com.coforge.model.Author;
import com.coforge.model.Book;
import com.coforge.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book/author")
    public Author addAuthor(@RequestBody Author author) {
        //System.out.println(" "+author.getBook().getAuthor());
        if (author.getBook() != null) {
            author.getBook().setAuthor(author);
        }
        return bookService.addAuthor(author);
    }

    @GetMapping("/book/author")
    public List<Author> getAllAuthor() {
        return bookService.getAllAuthors();
    }


    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        try {
            return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);

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
            return new ResponseEntity<>(bookService.showAllBooks(), HttpStatus.FOUND);
        } catch (BookException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    // custom methods
    //http://localhost:9090/book2/java for beginner
    @GetMapping("/book2/{bname}")
    public Book findByBname(@PathVariable("bname") String bname) {
        return bookService.findByBname(bname);
    }

    @GetMapping("/book1")
    public Book searchByBname(@RequestParam("bname") String bname) {
        return bookService.searchByBname(bname);
    }

    //http://localhost:9090/book/java for beginner/400.0
    @GetMapping("/book/{bname}/{cost}")
    public Book findByBnameAndCost(@PathVariable String bname, @PathVariable float cost) {
        return bookService.findByBnameAndCost(bname, cost);
    }

    @GetMapping("/book1/{cost}")
    public Book findByCost(@PathVariable("cost") float cost) {
        return bookService.findByCost(cost);
    }

}
