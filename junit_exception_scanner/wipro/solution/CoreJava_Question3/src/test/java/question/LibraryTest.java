package question;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {
	Library library;
	Book book[];

	@BeforeEach
	void setUp() throws Exception {
		library = new Library();
		book = new Book[5];
		book[0] = new Book(54455454, "java beginner", "sunil kumar");
		book[1] = new Book(54455455, "java professional", "amit kumar");
		book[2] = new Book(54455456, "java for dummies", "kamal kumar");
		book[3] = new Book(54455457, "java beginner", "sunil kumar");
		book[4] = new Book(54455458, "java professional", "amit kumar");

		for (Book b : book) {
			library.addBook(b);
		}
	}

	@Test
	void testGetBookList() {
		List<Book> list1 = new ArrayList<Book>();

		for (Book b : book) {
			list1.add(b);
		}
		assertArrayEquals(library.getBookList().toArray(), list1.toArray());
	}

	@Test
	void testAddBook() {
		library = null;
		library = new Library();
		Book book = new Book(54455454, "java beginner", "sunil kumar");
		library.addBook(book);
		Book book2 = library.getBookList().get(0);
		assertEquals(book2, book);
	}

	@Test
	void testIsEmpty() {
		library = null;
		library = new Library();
		assertTrue(library.getBookList().size() == 0);
	}

	@Test
	void testViewAllBooks() {
		library = null;
		library = new Library();
		book = new Book[5];
		book[0] = new Book(54455454, "java beginner", "sunil kumar");
		book[1] = new Book(54455455, "java professional", "amit kumar");
		book[2] = new Book(54455456, "java for dummies", "kamal kumar");
		book[3] = new Book(54455457, "java beginner", "sunil kumar");
		book[4] = new Book(54455458, "java professional", "amit kumar");

		for (Book b : book) {
			library.addBook(b);
		}
		List<Book> list1 = new ArrayList<Book>();

		for (Book b : book) {
			list1.add(b);
		}
		assertArrayEquals(library.getBookList().toArray(), list1.toArray());
	}

	@Test
	void testViewBooksByAuthor() {
		ArrayList<Book> viewBooksByAuthor = library.viewBooksByAuthor("sunil kumar");
		assertEquals(viewBooksByAuthor.size(), 2);
	}

	@Test
	void testCountnoofbook() {
		assertEquals(library.countnoofbook("java beginner"), 2);
	}

}
