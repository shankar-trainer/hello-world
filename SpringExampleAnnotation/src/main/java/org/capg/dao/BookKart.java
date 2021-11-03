package org.capg.dao;

import java.util.ArrayList;
import java.util.List;

import org.capg.model.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookKart {

	private static List<Book> bookList;
	
	@Value("#{bookKart.bookList[2]}")
	private Book lastBook;

	@Value("#{bookKart.bookList[0]}")
	private Book firstBook;

	static {
		bookList=new ArrayList<>();
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();

		b1.setBookIsbn(10001);
		b1.setBookName("java beginner");
		b1.setBookCost(780);

		b2.setBookIsbn(10002);
		b2.setBookName("spring beginner");
		b2.setBookCost(1280);

		b3.setBookIsbn(10003);
		b3.setBookName("jpa beginner");
		b3.setBookCost(800);
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
	}

	public Book getFirstBook() {
		return firstBook;
	}

	public void setFirstBook(Book firstBook) {
		this.firstBook = firstBook;
	}

	public Book getLastBook() {
		return lastBook;
	}

	public void setLastBook(Book lastBook) {
		this.lastBook = lastBook;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public List<Book> getAllBook() {
		return bookList;
	}

}
