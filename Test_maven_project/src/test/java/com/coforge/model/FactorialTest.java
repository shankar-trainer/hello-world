package com.coforge.model;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FactorialTest {

	@Test
	void testGetFactorial() {
		System.out.println("factorial test");
		assertEquals(Factorial.getFactorial(5), 120);
	}
	//@Test
	@ParameterizedTest
	@ValueSource(ints= {1,3,5,7})
	void testcheckOdd(int p) {
		System.out.println("check Odd  test");
		assertTrue(Factorial.checkOdd(p));
	}
	

}
