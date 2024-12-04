package org.technous.batchPrac3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import org.technous.batchPrac3.model.Book;
import org.technous.batchPrac3.service.BookService;

@RestController
@RequestMapping("/public/api")
public class BookController {

    @Autowired
    private BookService bookService;

//    @Autowired
//    private RestTemplate restTemplate;
private RestTemplate restTemplate=new RestTemplate();


    @GetMapping("/book/get")
    public String getAll(){
        return "get all employee";
    }

    @GetMapping("/getAll")
    public String getOne(){
        return "Get only one Employee ";
    }

    @GetMapping("/getApi")
    public String getAip(){
       return restTemplate.getForObject("https://dummyjson.com/products/1",String.class);
    }


    @PostMapping("/saveBook")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        Book mybook = bookService.createBook(book);
        return new ResponseEntity<>(mybook, HttpStatus.OK);
    }

}
