package com.abc.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.abc.model.Book;


class BookDaoTest {

	BookDao dao;

	Book book[];

	@BeforeEach
	void setUp() throws Exception {
		dao = new BookDao();
		book = new Book[4];
		book[0] = new Book(988998, "java beginner", "s kumar", 567);
		book[1] = new Book(988991, "java in action", "a kumar", 1567);
		book[2] = new Book(988992, "java pro", "p kumar", 767);
		book[3] = new Book(988997, "java 8", "k kumar", 920);
		for (Book book2 : book) {
			dao.addBook(book2);
		}
	}

	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
	}

	@Test
	void getAllBooktest() {
		assertEquals(4, dao.getAllBook().size());
		assertNotNull(dao.getAllBook());
	}

	@Disabled
	@Test
	void addBooktest() {
		dao.addBook(new Book(2, "my book1", "author1", 879));
		assertEquals(5, dao.getAllBook().size());
	}

	@Test
	void searchBooktest() {
		assertTrue(dao.searchBook(book[0]));
		assertFalse(dao.searchBook(new Book(1, "my book", "author", 8799)));
	}

}
