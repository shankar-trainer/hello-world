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
		System.out.println("book test 1");
		assertEquals(book1, book2);
	}

	@Test
	void bookTest1() {
		System.out.println("book test 2");
		assertNotNull(book1);
		assertNotNull(book2, "book2 is null");

	}

	@Test
	void testGetIsbn() {
		assertEquals(book1.getIsbn(), 56565);
	}

	@Test
	void testGetName() {
		assertEquals(book2.getName(), "java in action");
	}

	@Test
	void testGetCost() {
		assertEquals(book2.getCost(), 1200);
	}

	@Test
	void testGetType() {
		assertEquals(book2.getType(), "computer");
	}

	@Test
	void testGetDiscount() {
		assertEquals(book2.getDiscount(), 0.12f);
	}
	 
	@Test
	void testFinalCost() {
		assertEquals(book1.finalCost(), 1056);
	}
}
