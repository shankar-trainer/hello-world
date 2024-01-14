package com.coforge.model;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BookTest {
    ApplicationContext ctx;
    Book book;
    @BeforeEach
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
       book= ctx.getBean(Book.class);
        System.out.println(book);
    }

    @Test
    public void testGetAllCustomer() {

        System.out.println();
        assertEquals(book.getIsbn(), 67776);
        assertEquals(book.getBname(), "spring recipee");
        assertEquals(book.getAuthor(), "s kumar");

    }

}
