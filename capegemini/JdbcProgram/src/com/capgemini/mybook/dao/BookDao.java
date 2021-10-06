package com.capgemini.mybook.dao;

import java.sql.SQLException;
import java.util.HashMap;
import com.capgemini.mybook.bean.Book;

public interface BookDao {
	public HashMap<Integer, Book> getAllBook() throws SQLException;
	public Book SearchBook(int isbn) throws SQLException;
	public boolean AddBook(Book book) throws SQLException;
	public boolean RemoveBook(int isbn);
	public boolean UpdateBook(Book book);
}
