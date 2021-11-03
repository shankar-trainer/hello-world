package org.capg.dao;

import java.util.ArrayList;
import java.util.List;

import org.capg.model.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookInfo {

	private List<Book> blist;
	@Value("#{bookInfo.blist[0]}")
	private Book firstBook;

	@Value("#{bookInfo.blist[2]}")
	private Book laststBook;

	public BookInfo() {
		blist = new ArrayList<Book>();
		Book book[] = new Book[3];

		book[0] = new Book();
		book[0].setIsbn(1211);
		book[0].setBname("spring in action");
		book[0].setAuthor("craig wall");

		book[1] = new Book();
		book[1].setIsbn(1210);
		book[1].setBname("spring beginner");
		book[1].setAuthor("martin flower ");

		book[2] = new Book();
		book[2].setIsbn(1213);
		book[2].setBname("spring microservices");
		book[2].setAuthor("deepka bohra");

		blist.add(book[0]);
		blist.add(book[1]);
		blist.add(book[2]);
	}

	public List<Book> getBlist() {
		return blist;
	}

	public void setBlist(List<Book> blist) {
		this.blist = blist;
	}

	public Book getFirstBook() {
		return firstBook;
	}

	public void setFirstBook(Book firstBook) {
		this.firstBook = firstBook;
	}

	public Book getLaststBook() {
		return laststBook;
	}

	public void setLaststBook(Book laststBook) {
		this.laststBook = laststBook;
	}

}
