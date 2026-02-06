package com.cts.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestBook {
    Book book1;
    Book book2;

    @BeforeEach
    public void setUp() {
        book1 = new Book(10001, "pragmatic junit", 345);
        book2 = new Book(10001, "pragmatic junit", 345);
    }

    @Test
    public void testBook() {
        assertEquals(book1,book2);
        assertNotNull(book1);
    }

    @Test
    public void testBookAllAttributes() {
        assertEquals(10001, book1.getIsbn());
        assertEquals("pragmatic junit", book1.getName());
        assertEquals(345, book1.getCost());
    }


}

