package com.capegemini.bookstore.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.capegemini.bookstore.dao.BookDao;
import com.capegemini.bookstore.dao.BookDaoImpl;
import com.capegemini.bookstore.dto.Book;
import com.capegemini.bookstore.exception.BookException;

public class BookServiceImpl implements BookService {

	BookDao dao;
	Book book;

	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}

	@Override
	public void searchBook(int isbn) throws BookException {
		if (isbn <= 0)
			throw new BookException("isbn cannot be -ve oe zero");
		else {
			book = null;
			book = new Book(isbn, null, 0);
			if (dao.searchBook(book) == null)
				System.out.println("Book is not present");
			else {
				System.out.println("Book Found");
				System.out.println(dao.searchBook(book));
			}
		}
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void addBooktoKart(Book book) {
		if (dao.addBook(book)) {
			/*
			 * System.out.println("How many book"); int qty = sc.nextInt(); if (qty > 1) {
			 * for (int i = 2; i <= qty; i++) { dao.addBook(book); } }
			 */
			System.out.println(" Book Added to the kart");
		} else
			System.out.println("Book no available");

	}

	@Override
	public void totalCost() {
		HashMap<Integer, Book> hashMap = dao.getAllBook();
		float cost = 0;
		for (Integer i : hashMap.keySet()) {
			Book b = hashMap.get(i);
			cost = cost + b.getCost();
		}
		System.out.println("Total Cost is " + cost);
	}

	@Override
	public void removeBook(int isbn) throws BookException {
		if (isbn <= 0)
			throw new BookException("isbn cannot be -ve oe zero");

		else {
			book = null;
			book = new Book(isbn, null, 0);
			if (dao.deleteBook(book))
				System.out.println("book with isbn " + isbn + " is deleted");
			else
				System.out.println("book not present");
		}
	}

	@Override
	public void allBookDetail() {

		HashMap<Integer, Book> hashMap = dao.getAllBook();

		for (Integer i : hashMap.keySet())
			System.out.println(hashMap.get(i));
	}

}
