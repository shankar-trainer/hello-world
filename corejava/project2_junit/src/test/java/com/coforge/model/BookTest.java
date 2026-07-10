package com.coforge.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    Book book,book1;

    @BeforeEach
    public void setUp()
    {
        this.book=new Book(876776,"java in action", 1200.0f);
        this.book1=new Book(876776,"java in action", 1200.0f);
    }

    @Test
    public void testBook(){
        assertNotNull(book );
        assertNotNull(book1 );
    }
    @Test
    public void testBookEquality(){
        assertEquals(book, book1 ); // assertEquals checks content
//        assertSame(book, book1 ); //checks references
        // assertSame checks references
    }

    
    @Test
    public void testIsbn(){
        assertEquals(book.getIsbn(), 876776);
    }

    @Test
    public void testBname(){
        assertEquals(book.getBname(), "java in action");
    }

    @Test
    public void testCost(){
        assertEquals(book.getCost(), 1200);
    }

}
