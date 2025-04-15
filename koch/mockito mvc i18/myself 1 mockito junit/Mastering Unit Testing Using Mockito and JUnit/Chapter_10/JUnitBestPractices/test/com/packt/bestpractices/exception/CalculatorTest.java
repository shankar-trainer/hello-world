package com.packt.bestpractices.exception;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CalculatorTest {

	@Rule
	public ExpectedException expectedException= ExpectedException.none();

	Calculator calc = new Calculator();

	@Test
	public void divideByZero_throws_exception() throws Exception {
		expectedException.expect(ArithmeticException.class);
		expectedException.expectMessage("/ by zero");
		calc.divide(1, 0);
	}
	
	@Test
	public void fails_when_an_exception_is_thrown() throws Exception {
			calc.sum(1,2,3);
	}
}
