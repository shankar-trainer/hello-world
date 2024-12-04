package com.abc.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	Calculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = new Calculator();
	}

	@Test
	void testAddition() {
		assertEquals(calculator.addition(12345, 12345), 24690);
		//assertEquals(calculator.addition(2147483647, 1), 2147483648);
	}
	
	@Test
	void testSummation() {
		assertEquals(calculator.summation(23.45f, 22.65f),46.1f );
	}

	@Test
	void testMultiplication() {
		assertEquals(calculator.multiplication(11, 2), 22);

	}

	@Test
	void testDivision() {
		
	}

}
