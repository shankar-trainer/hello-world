package org.coforge.web;

import java.util.List;

import org.coforge.model.Book;
import org.coforge.repository.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookDao dao;
	
	@PostMapping("/add")
	public Book addBook(@RequestBody Book  b) {
		System.out.println("add book is "+b);
	  return dao.save(b);
	}
	
	@GetMapping("/all")
	public List<Book> geAllBook() {
		 return dao.findAll();
	}
	
}
