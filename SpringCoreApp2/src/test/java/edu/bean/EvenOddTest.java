package edu.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EvenOddTest {

	EvenOdd evenodd;
	
	@BeforeEach
	void setUp() throws Exception {
	 evenodd=new EvenOdd();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTestMethod() {
		
		assertTrue(evenodd.testMethod(120)," not  even no");
		assertFalse(evenodd.testMethod(131),"not  odd no");
		  
	}

}
