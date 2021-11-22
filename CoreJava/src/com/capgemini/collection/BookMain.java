package com.capgemini.collection;

import java.util.List;

import com.capgemini.model.Book;

public class BookMain {

	public static void main(String[] args) {
		Book book[] = new Book[3];

		BookDao bookDao = new BookDao();

		int isbn[] = { 6776, 8878, 8778 };
		float cost[] = { 565, 456, 1200 };
		String bname[] = { "learning sql", "sql beginner", "sql for dummies" };
		
		for (int x=0;x<book.length;x++) {
			book[x] = new Book();
			book[x].setBname(bname[x]);
			book[x].setIsbn(isbn[x]);
			book[x].setCost(cost[x]);
			bookDao.addBook(book[x]);
		}
		
		List<Book> allBook = bookDao.getAllBook();
		for (Book book2 : allBook) {
			System.out.println(book2.getIsbn() + "  " + book2.getBname() + "  " + book2.getCost());
		}

		Book searchBook = bookDao.searchBook(book[0]);
		if (searchBook != null) {
			System.out.println("book found ");
			System.out.println("isbn " + searchBook.getIsbn());
			System.out.println("cost " + searchBook.getCost());
			System.out.println("name " + searchBook.getBname());
		} else
			System.out.println("not found");
	}
}
