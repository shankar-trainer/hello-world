package com.coforge.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
	Book book1;
	Book book2;

	@BeforeEach
	void setUp() throws Exception {
		book1 = new Book(56565, "java in action", 1200, "computer", 0.12f);
		book2 = new Book(56565, "java in action", 1200, "computer", 0.12f);
	}

	@AfterEach
	void tearDown() throws Exception {
		book1 = null;
	}

	@Test
	void bookTest() {
		System.out.println("book test");
		assertEquals(book1, book2);
	}

	@Test
	void testSetIsbn() {
	}

	@Test
	void testSetName() {
	}

	@Test
	void testSetCost() {
	}

	@Test
	void testSetType() {
	}

	@Test
	void testSetDiscount() {
	}

}