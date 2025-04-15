package com.cts.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import com.cts.model.Factorial;

class FactorialTest {

	Factorial factorial;

	@BeforeEach
	void setUp() throws Exception {
		factorial = new Factorial();
	}

	@Test
	@RepeatedTest(value = 10)
	@TestFactory
	void testGetFactorial() {
		assertEquals(120, factorial.getFactorial(5));
		assertEquals(3628800, factorial.getFactorial(10));
	}

}
