package com.cts.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator;
	
	
	@BeforeEach
	void setUp() throws Exception {
	 calculator=new Calculator();
	}

	@Test
	void testAddition() {
		assertEquals(20, calculator.addition(15, 5));
	}

	@Test
	void testSubtraction() {
		assertEquals(10, calculator.subtraction(15, 5));
	}

	@Test
	void testMultiplication() {
		assertEquals(90, calculator.multiplication(18, 5));
	}

	@Test
	void testDivision()  throws IllegalArgumentException{
		assertEquals(3, calculator.division(15, 5));
		assertEquals(Float.POSITIVE_INFINITY, calculator.division(15, 0));
	}

}
