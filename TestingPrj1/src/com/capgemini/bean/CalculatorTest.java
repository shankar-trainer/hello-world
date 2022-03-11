package com.capgemini.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
Calculator calculator;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	 System.out.println(" @BeforeAll called once ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(" @After All called  once ");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator=new Calculator();
		
	 System.out.println(" @BeforeEach  called every time");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
		System.out.println(" @AfterEach  called every time");
	}

	@Test
	void testAddition() {
		assertEquals(33,calculator.addition(11, 22));
	}

	@Test
	void testSubtraction() {
		assertEquals(-11,calculator.subtraction(11, 22));
	//	fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		assertEquals(0.5,calculator.division(11, 22));
		//fail("Not yet implemented");
	}

}
