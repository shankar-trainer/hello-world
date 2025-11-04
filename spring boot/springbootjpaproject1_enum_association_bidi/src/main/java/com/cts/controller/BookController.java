package com.cts.controller;

import com.cts.model.Book;
import com.cts.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public Book addBook(@RequestBody  Book b) {

        return bookService.addBook(b);
    }

    @GetMapping("/book")
    public Page<Book> getBook(Pageable page) {
        return bookService.getBookByPage1(page);
    }

}
///http://localhost:8080/book?page=2&size=4&sort=bname,desc
///http://localhost:8080/book?page=0&size=4
///http://localhost:8080/book?page=1&size=4