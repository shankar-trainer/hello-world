package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;

@RestController
@RequestMapping("/")
public class BookController {
	List<Book> blist;

	public BookController() {
		Book b[] = new Book[5];
		b[0] = new Book(344443, "two states", 600);
		b[1] = new Book(344444, "gaban", 500);
		b[2] = new Book(344445, "java in action", 1400);
		b[3] = new Book(344446, "java for beginner", 1100);
		b[4] = new Book(344447, "three mistake in my life", 800);

		blist = new ArrayList<>();
		for (Book b1 : b)
			blist.add(b1);
		System.out.println("total book is " + blist.size());
	}

//	//@RequestMapping("/book/isbn")
//	@GetMapping("/book/{isbn}")
//	public Book searchBook(@PathVariable int isbn) {
//		System.out.println("isbn is "+isbn);
//
//		for (Book b : blist) {
//			if (b.getIsbn() == isbn)
//				return b;
//		}
//		return null;
//	}
//	

	@GetMapping("/book/{isbn}")
	public ResponseEntity<Book> searchBook(@PathVariable int isbn) {

		for (Book b : blist) {
			if (b.getIsbn() == isbn)
				return new ResponseEntity<Book>(b, HttpStatus.OK);
		}
		return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/addbook")
	public ResponseEntity<Book> addBook(@RequestBody Book b) {
		blist.add(b);
		return new ResponseEntity<Book>(b, HttpStatus.CREATED);
	}

//	@RequestMapping("/allbook")
	@GetMapping("/allbook")
	public List<Book> getAllBoook() {
		return blist;
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}

	@RequestMapping("/book")
	public Book getBook() {
		Book book = new Book();
		book.setIsbn(66776767);
		book.setCost(500);
		book.setBname("spring boot in action");
		return book;
	}

}
