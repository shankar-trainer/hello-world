package com.capg.beans.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ICalculatorTest {
	ICalculator calculator;

	@BeforeEach
	void setUp() throws Exception {
		// calculator=new ICalculator();
		calculator = mock(ICalculator.class);
	}

	@Test
	void testAddition() {
		calculator.add(13, 14);
		when(calculator.multiply(13, 14)).thenReturn(27);//stubbing
		verify(calculator).add(13, 14);
	}
	@Test
	void testSubtraction() {
		calculator.add(130, 14);
		when(calculator.multiply(130, 14)).thenReturn(116);//stubbing
		verify(calculator).add(130, 14);
	}
	
	
	
	@Test
	void testMultiply() {
		calculator.multiply(3, 4);
		when(calculator.multiply(3, 4)).thenReturn(12);//stubbing
		verify(calculator).add(3, 4);
	}
	
	@Test
	void testDivision() {
		calculator.division(11, 2);
		when(calculator.division(11, 2)).thenReturn(5);//stubbing
		verify(calculator).division(11, 2);
		
		calculator.division(11, 12);
		when(calculator.division(11, 12)).thenReturn(0);//stubbing
		verify(calculator).division(11, 12);
	
		
		calculator.division(11, 0);
		when(calculator.division(11, 0)).thenThrow(ArithmeticException.class);//stubbing
		verify(calculator).division(11, 12);
	}
	
}
