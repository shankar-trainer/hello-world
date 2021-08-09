package com.example.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

		@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddition() {
	assertEquals(Calculator.addition(12.3f, 45.5f),57.8f);
	
	}

	@Test
	void testMultiplication() {
		assertEquals(Calculator.multiplication(12.3f, 4.5f),55.350002f);
	}

	@Test
	void testDivision() {
		assertEquals(Calculator.division(12.3f, 4.5f),2.7333333f);
	}

	@Test
	void testSubtraction() {
		assertEquals(Calculator.subtraction(12.3f, 4.5f),7.8f);
	}

}
