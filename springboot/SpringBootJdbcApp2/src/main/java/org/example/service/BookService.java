package org.example.service;

import org.example.exception.BookException;
import org.example.model.Book;

import java.util.List;

/**
 * Created by shankar on 4/21/2023.
 */
public interface  BookService {

    public Book addBook(Book b) throws BookException;
    public Book updateBook(Book b) throws BookException;
    public Book searchBook(int isbn) throws BookException;
    public Book removeBook(int isbn) throws BookException;
    public List<Book> getAllBook() throws BookException;

}
