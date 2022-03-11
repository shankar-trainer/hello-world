package com.capgemini;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorial {

	
	Factorial factorial;
	
	
	@BeforeEach 
	void start() {
	factorial=new Factorial();
	
	}
	
	@Test
	void testFactorial(){
		assertEquals(120, factorial.getFactorial(5));
	}
    
	
	
	
}
