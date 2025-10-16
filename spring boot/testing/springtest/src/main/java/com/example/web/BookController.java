package com.example.web;

import com.example.dao.BookRepository;
import com.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return  bookRepository.save(book);
    }
    @GetMapping
    public List<Book> getAllBook(){
        return  bookRepository.findAll();
    }

}
