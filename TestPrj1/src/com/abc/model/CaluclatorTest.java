package com.abc.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaluclatorTest {

	Calculator calc;
	
	@BeforeEach
	void setUp() throws Exception {
	  calc=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
     calc=null;
	}

	@Test
	void testAddition() {
	  assertEquals(calc.addition(11, 22), 33);
	}

	@Test
	void testMultiplication() {
//		fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		//fail("Not yet implemented");
	}

}
