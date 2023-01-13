package com.tvscredit.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvscredit.model.Book;
import com.tvscredit.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping("/all")
	public   ResponseEntity<List<Book>> getAllBook(){
		try {
		return  new  ResponseEntity<>( bookService.getAllBook(), HttpStatus.OK);
		}
		catch (Exception e) {
	    	return  new  ResponseEntity( e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Book> serchAllBook(@PathVariable int id){
	    try {   
		return  new  ResponseEntity<>( bookService.searchBook(id), HttpStatus.OK);
	    }
	    catch (Exception e) {
	    	return  new  ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	       
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable int id){
		try {
			return  new  ResponseEntity<>(bookService.deleteBook(id), HttpStatus.OK);
		}
		catch (Exception e) {
	    	return  new  ResponseEntity( e.getMessage(), HttpStatus.NOT_FOUND);

		}
	}

	@PostMapping("/add")	
	public  ResponseEntity<Book> addBook(@RequestBody Book book) {
	    try {
	    	return  new  ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
	    }
	    catch (Exception e) {
	    	return  new  ResponseEntity( e.getMessage(), HttpStatus.NOT_FOUND);
	    }
}
	
	
	@PutMapping("/update")	
	public ResponseEntity<Book> updateBook(@RequestBody Book book) {
	    try {
	    	return  new  ResponseEntity<>(bookService.updateBook(book), HttpStatus.CREATED);
	    }
	    catch (Exception e) {
	    	return  new  ResponseEntity( e.getMessage(), HttpStatus.NOT_FOUND);
	    }
		
	}
	
}