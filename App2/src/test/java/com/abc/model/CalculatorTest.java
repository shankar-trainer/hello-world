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
	}

	@Test
	void testMultiplication() {
		assertEquals(calculator.multiplication(11, 2), 20);

	}

	@Test
	void testDivision() {
	}

}
