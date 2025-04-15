package com.cts.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.model.Book;

public class BookTest {

	ApplicationContext ctx;
	Book b1;
	Book b2;
	@BeforeEach
	public void setUp() {
		ctx= new ClassPathXmlApplicationContext("beans.xml");
		 b1=ctx.getBean("book1",Book.class);
		 b2=ctx.getBean("book1",Book.class);
	}
	
	@Test
	public void test() {
	  assertNotNull(b1);
	  assertEquals(b1.getIsbn(), 87878787);
	  assertEquals(b1.getBname(), "hibernate in action");
	  assertEquals(b1.getCost(), 1700);
	} 
	
	@Test
	public void testSingleTon() {
		assertSame(b1, b2);
	}
}
