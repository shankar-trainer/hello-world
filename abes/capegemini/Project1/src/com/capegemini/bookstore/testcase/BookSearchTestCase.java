package com.capegemini.bookstore.testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capegemini.bookstore.dao.BookDao;
import com.capegemini.bookstore.dao.BookDaoImpl;
import com.capegemini.bookstore.dto.Book;

public class BookSearchTestCase {

	Book book;
	BookDao dao;
	
	@Before
	public void init() {
		book=new Book(1234, "my Book", 456);
		dao=new BookDaoImpl();
	    dao.addBook(book);	
	}
	
	@Test
	public void searhcTest1() {
		  assertEquals(book, dao.searchBook(book));
	}
	
}
