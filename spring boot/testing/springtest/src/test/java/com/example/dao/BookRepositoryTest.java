package com.example.dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.model.Book;

@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

	@Autowired
	private BookRepository bookRepository;
	
	Book book;
	
	@BeforeEach
	public void init() {
		//book=Book.builder().isbn(1).bname("spring in action").cost(12000).build();
		book=Book.builder().bname("spring in action").cost(12000).build();
		bookRepository.save(book);
	}
	
	@Test
	public void bookTest() {
		assertTrue( bookRepository.findAll().contains(book));
	}

	@Test
	public void bookTestById() {
         var isbn=bookRepository.findAll().get(0).getIsbn();

		assertTrue( bookRepository.findById(isbn).isPresent());
	}

    @Test
    public void bookTestByName() {
        assertTrue( bookRepository.findBybname("spring in action").size()>=1);
    }

}
/*
mvn test -Dtest=com.example.dao.BookRepositoryTest
mvn test -Dtest=com.example.dao.BookRepositoryTest#bookTestById


 */