package org.com.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculationTest {

	Calculation calculation;
	
	@BeforeEach
	void setUp() throws Exception {
	calculation=new Calculation();
	
	}

	@AfterEach
	void tearDown() throws Exception {
	 calculation=null;
	}

	@Test
	void testAddition() {
	assertEquals(4, calculation.addition(1, 2));	
	}

	@Test
	void testSubtraction() {
		assertEquals(9, calculation.subtraction(11, 2));	
	}

}
