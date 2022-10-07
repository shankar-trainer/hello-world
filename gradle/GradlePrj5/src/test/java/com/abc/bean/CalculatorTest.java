package com.abc.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
	 calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator=null;
	}

	@Test
	void testAddition() {
		assertEquals(25.7f, calculator.addition(12.3f,13.4f));
	}

	@Test
	void testSubtraction() {
		assertEquals(87.100006f, calculator.subtraction(100.3f,13.2f));
	
		assertNotNull(calculator.subtraction(100.3f,13.2f));
		
		assertNotNull(calculator);
		//calculator=null;
		assertNotNull(calculator,"calculator is  null");
		
		
		
	}

}
