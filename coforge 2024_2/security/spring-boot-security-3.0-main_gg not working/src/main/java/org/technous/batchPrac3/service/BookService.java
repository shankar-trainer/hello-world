package org.technous.batchPrac3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.technous.batchPrac3.dao.BookRepository;
import org.technous.batchPrac3.model.Book;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository  repository;

    public Book createBook(Book b){
       return  repository.save(b);
    }
    public List<Book> getAll(Book b){
       return  repository.findAll();
    }

}
