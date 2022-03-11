package com.capgemini;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class TestOddEven {

  OddProgram oddProgram;	
	
	@BeforeEach 
	void start() {
	oddProgram=new OddProgram();
	}
	
	@Test
	@ParameterizedTest
	@ValueSource(ints= {1,2,3,4,5,6,7,8,9} )
	void testOdd(int n){
		assertTrue(oddProgram.check(n));
	}
	
	@Disabled
	@Test
	void myTest() {
	 assertNotEquals(1, 2);
	}
    
	
}
