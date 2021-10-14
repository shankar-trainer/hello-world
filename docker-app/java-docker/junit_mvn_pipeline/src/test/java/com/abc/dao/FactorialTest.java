package com.abc.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FactorialTest {

	Factorial factorial;
	@BeforeEach
	void setUp() throws Exception {
	 factorial=new Factorial();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	}

	@Test
	void  factorialTest() {
		assertSame(120, factorial.factorial(5));
	} 
	
	@ParameterizedTest
	@ValueSource(ints={1,2,3,4,5})
		void  factorialTest1(int x) {
		assertNotNull( factorial.factorial(x));
		System.out.print(factorial.factorial(x)+" , ");
	} 
}
