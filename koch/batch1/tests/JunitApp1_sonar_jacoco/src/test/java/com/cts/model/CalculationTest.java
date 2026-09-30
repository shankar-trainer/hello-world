package com.cts.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculationTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll called");
	}

	Calculation calculation;
	@BeforeEach
	void setUp() throws Exception {
		calculation=new Calculation();
		System.out.println("@BeforeEach called ");
	}

	@Test
	void testSum() {
		assertEquals(33,calculation.sum(11, 22) );
		
	}

	@Test
	void testSubtraction() {
		assertEquals(22,calculation.subtraction(44, 22) );

	}

	@Test
	void testMultiplication() {
		assertEquals(126,calculation.multiplication(6, 21) );

	}

	@Test
	void testDivision() {
		assertEquals(2,calculation.division(11, 5) );
		assertEquals(1,calculation.division(11, 11) );
		assertEquals(0,calculation.division(11, 12) );
		assertThrows(ArithmeticException.class,()->{
			calculation.division(11, 0);
		});
		//assertEquals(0,calculation.division(11, 0) );
	}

}
