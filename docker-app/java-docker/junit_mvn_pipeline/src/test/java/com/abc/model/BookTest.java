package com.abc.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {

	Book book1, book2;

	@BeforeEach
	void setUp() throws Exception {
		book1 = new Book(343443, "junit for beginner", "a kumar", 890);
		book2 = new Book(343443, "junit for beginner", "a kumar", 890);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(book1, book2);
	}
	
	@Test
	void getAuthortest() {
		
		assertEquals(book1.getAuthor(), "a kumar");
		
		assertNotNull(book1.getAuthor());
		
	}
	
	@Test
	void getAuthorCost() {
		assertEquals(book1.getCost(), 890);
	}
	

}
