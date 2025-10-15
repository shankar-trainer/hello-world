package com.example.dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.model.Book;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookRepositoryTest {

	
	@Autowired
	private BookRepository bookRepository;
	
	Book book;
	
	@BeforeEach
	public void init() {
		book=Book.builder().banme("spring in action").cost(12000).build();
		bookRepository.save(book);
	}
	
	@Test
	public void bookTest() {
		assertTrue( bookRepository.findAll().contains(book));
		 
	}
	
	
	
	
	
}
