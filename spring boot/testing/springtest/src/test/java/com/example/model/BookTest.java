package com.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	Book book;
	Book book1;
	@BeforeEach
	void setUp() throws Exception {
	// book=new Book(10001,"spring",1200.0f);
	 book1=new Book(10001,"spring",1200.0f);
	
	 //book=new Book();
	 //book.setIsbn(0);
	 book=Book.builder().isbn(10001).bname("spring").cost(1200).build();
	 
	}
	

	@Test
	void bookTest() {
		
	//	Assertions.assertEquals(10001, book.getIsbn());
		assertEquals(10001, book.getIsbn());
		assertNotNull(book);
//		assertNull(book);
	}
	
	@Test
	void bookTest1() {
	assertEquals(book,book1);
	
	//assertSame(book1, book);
	}
	

}
