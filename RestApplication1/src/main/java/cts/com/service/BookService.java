package cts.com.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cts.com.model.Book;

//@Controller
@RestController
@RequestMapping("book")
public class BookService {
	static List<Book> bookList = new ArrayList<Book>();
	static {
		int isbn[] = { 9001, 9002, 9003, 9004, 9005 };
		String bname[] = { "java in action", "java beginner", "spring boot in action", "spring recipe",
				"learning angular" };
		float cost[] = { 1000, 1200, 700, 856, 657 };
		String author[] = { "Suresh Parbhu", "Amitabh Chakrbarty", "P Shukla", "A Kumar", "R Srivastva" };
		LocalDate date[] = { LocalDate.of(2018, 12, 23), LocalDate.of(2018, 11, 12), LocalDate.of(2019, 2, 21),
				LocalDate.of(2020, 1, 23), LocalDate.of(2021, 1, 23) };

		for (int i = 0; i < author.length; i++) {
			Book book = null;
			book = new Book();
			book.setIsbn(isbn[i]);
			book.setBname(bname[i]);
			book.setCost(cost[i]);
			book.setAuthor_name(author[i]);
			book.setPublishDate(date[i]);
			bookList.add(book);
		}
	}

	@RequestMapping("/hello")
	// @ResponseBody
	public String hello() {
		return "hello world";
	}

	@RequestMapping("/book1")
	// @ResponseBody
	public Book mybook() {
		Book book = new Book();
		book.setIsbn(4554665);
		book.setBname("spring rest with boot");
		book.setAuthor_name("pankaj kumar");
		book.setCost(1678);
		book.setPublishDate(LocalDate.of(2020, 12, 29));
		return book;
	}

	// @RequestMapping("/getAllBook")
	@RequestMapping(value = "/getAllBook", method = RequestMethod.GET, headers = "Accept=application/json")
	// @ResponseBody
	public List<Book> getAllBook() {
		return bookList;
	}
	
	@RequestMapping(value = "/getAllBook1", method = RequestMethod.GET, headers = "Accept=application/json")
	public  ResponseEntity <List<Book>> getAllBook1() {
	    if(bookList.size()!=0)
		return new ResponseEntity<List<Book>>(bookList,HttpStatus.OK);
	    else
		return new ResponseEntity<List<Book>>(HttpStatus.NOT_FOUND);
	}
	

//	@RequestMapping(value = "/search_book/{isbn}", method = RequestMethod.GET)
//	@RequestMapping("/search_book/{isbn}")

	@GetMapping("/search_book/{isbn}")
	public Book search_mybook(@PathVariable("isbn") int isbn) {

		Book book = null;
		for (Book b : bookList) {
			if (b.getIsbn() == isbn) {
				book = b;
				break;
			}
		}
		return book;
	}

	@GetMapping("/search_book1/{isbn}")
	public ResponseEntity<Book> search_mybook1(@PathVariable("isbn") int isbn) {

		Book book = null;
		for (Book b : bookList) {
			if (b.getIsbn() == isbn) {
				book = b;
				break;
			}
		}
		if (book != null)
			return new ResponseEntity<Book>(book, HttpStatus.OK);
		else
			return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	}

	//@RequestMapping(value = "/delete_book/{isbn}", method = RequestMethod.DELETE)
	@DeleteMapping("/delete_book/{isbn}")
	public Book delete_mybook(@PathVariable("isbn") int isbn) {
		Book book = null;
		for (Book b : bookList) {
			if (b.getIsbn() == isbn) {
				book = b;
				break;
			}
		}
		bookList.remove(book);
		return book;
	}

	//@RequestMapping(value = "/delete_book1/{isbn}", method = RequestMethod.DELETE)
	@DeleteMapping("/delete_book1/{isbn}")
	public ResponseEntity<Book> delete_mybook1(@PathVariable("isbn") int isbn) {
		Book book = null;
		for (Book b : bookList) {
			if (b.getIsbn() == isbn) {
				book = b;
				break;
			}
		}

		bookList.remove(book);
		if (book != null)
			return new ResponseEntity<Book>(book, HttpStatus.OK);
		else
			return new ResponseEntity<Book>(book, HttpStatus.NOT_FOUND);
	}

}
