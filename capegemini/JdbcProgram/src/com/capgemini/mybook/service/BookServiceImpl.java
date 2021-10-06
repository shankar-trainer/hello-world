package com.capgemini.mybook.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.capgemini.mybook.bean.Book;
import com.capgemini.mybook.dao.BookDao;
import com.capgemini.mybook.dao.BookDaoImpl;
import com.capgemini.mybook.exception.BookException;

public class BookServiceImpl implements BookService {
	BookDao bookDao;
	HashMap<Integer, Book> hashMap;
	Book book = null;
	Scanner scanner = new Scanner(System.in);

	int isbn;
	String name, author;
	float cost;

	public BookServiceImpl() throws SQLException {
		bookDao = new BookDaoImpl();
	}

	@Override
	public void showAllBook() throws SQLException {
		hashMap = bookDao.getAllBook();

		Set<Integer> keyset = hashMap.keySet();
		for (Integer integer : keyset) {
			System.out.println(hashMap.get(integer));
		}
	}

	@Override
	public void insertBook() throws SQLException, BookException {
		System.out.println("Add Book Data");
		System.out.println("Enter Isbn");
		book = null;
		book = new Book();
		isbn = scanner.nextInt();
		if (isbn <= 0)
			throw new BookException("invalid isbn <0");
		else
			book.setIsbn(isbn);

		System.out.println("Enter Name Of 5 or more chars");
		scanner.nextLine();
		name = scanner.nextLine();
		if (name.isEmpty())
			throw new BookException("book name is empty");
		else if (name.length() < 5)
			throw new BookException("book name length cannot be <5 chars");
		else
			book.setBook_name(name);

		System.out.println("Enter Cost");
		cost = scanner.nextFloat();
		if (cost <= 0)
			throw new BookException("invalid cost <=0");
		else
			book.setCost(cost);

		System.out.println("Enter Author of 5 or more chars");
		scanner.nextLine();
		author = scanner.nextLine();
		if (author.isEmpty())
			throw new BookException("book author is empty");
		else if (author.length() < 5)
			throw new BookException("book author length cannot be <5 chars");
		else
			book.setBook_author(author);

		if (bookDao.AddBook(book))
			System.out.println("Book Added");
		else
			System.out.println("Book Already Present or Some Error");
	}
}
