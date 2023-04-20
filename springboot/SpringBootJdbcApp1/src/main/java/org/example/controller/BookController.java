package org.example.controller;

import lombok.Data;
import org.example.dao.BookDao;
import org.example.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shankar on 4/20/2023.
 */
@RestController
@RequestMapping("/")
@Data
public class BookController {

    //@Autowired
    BookDao bookDao;

    @GetMapping("/all")
    public List<Book> getAllBook(){
        return  bookDao.getAllBook();
    }

}
