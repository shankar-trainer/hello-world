package org.cts.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FactorialTest {
	IFactorial factorial;
	
	@BeforeEach
	void setUp() throws Exception {
	  factorial=new Factorial();
	}

	@Test
	void test() {
		 assertEquals(factorial.fact(5), 120);
	}
	
	@ParameterizedTest
	//@ValueSource(ints= {1,2,3,4,5,6})
    @CsvSource(
    		{"1,1", "2,2","3,6","4,24","5,120"})
	void test1(int input, int expected) {
		assertEquals(factorial.fact(input), expected);
	}

}
