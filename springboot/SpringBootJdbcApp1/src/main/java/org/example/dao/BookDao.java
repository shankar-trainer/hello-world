package org.example.dao;

import org.example.model.Book;

import java.util.List;

/**
 * Created by shankar on 4/19/2023.
 */
public interface  BookDao {
    public boolean addBook(Book b);
    public Book updateBook(Book b);
    public Book searchBook(int isbn);
    public Book removeBook(int isbn);
    public List<Book> getAllBook();


}
