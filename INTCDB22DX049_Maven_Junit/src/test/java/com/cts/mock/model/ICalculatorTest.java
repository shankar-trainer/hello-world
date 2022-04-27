package com.cts.mock.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ICalculatorTest {
ICalculator calc;

	@BeforeEach
	void setUp() throws Exception {
	  calc=mock(ICalculator.class);
	}

	@Test
	void testAddition() {
		  calc.addition(2, 3);
		  when(calc.addition(2, 3)).thenReturn(5);//stubbing
		  verify(calc).addition(2, 3);
	}
	
	@Test
	void testDivision2() {
		calc.division(20, 21);
		when(calc.division(20, 21)).thenReturn(0);//stubbing
		verify(calc).division(20, 21);
	}
	@Test
	void testDivision3() {
		calc.division(20, 0);
		when(calc.division(20, 0)).thenThrow(ArithmeticException.class);//stubbing
		verify(calc).division(20, 0);
	}

}
