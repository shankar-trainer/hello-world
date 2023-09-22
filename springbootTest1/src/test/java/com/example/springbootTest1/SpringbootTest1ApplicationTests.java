package com.example.springbootTest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.model.Book;

@SpringBootTest
class SpringbootTest1ApplicationTests {

	//@Autowired
	Book book;

	ApplicationContext ctx;
	
	@BeforeEach
	public void init() {
		ctx=new AnnotationConfigApplicationContext(Book.class);
		book=ctx.getBean(Book.class);
		book.setIsbn(767667);
		book.setBname("java in action");
		book.setCost(1200);
	}

	@Test
	void contextLoads() {
		assertEquals(book.getIsbn(), 767667);
		assertEquals(book.getBname(), "java in action");
		assertEquals(book.getCost(), 1200);
	}

}
