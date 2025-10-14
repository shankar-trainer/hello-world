package com.cts.service;

import com.cts.dao.BookRepository;
import com.cts.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book b){
        System.out.println("book added "+b);
        return  bookRepository.save(b);
    }


    public Page<Book> getBookByPage1(Pageable pageable){
        return  bookRepository.findAll(pageable);

    }


    public Page<Book> getBookByPage(int  page, int size, Sort sort){

        org.springframework.data.domain.Pageable pageable = PageRequest.of(page, size, sort);
        return  bookRepository.findAll(pageable);

    }



}
