package org.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculatorTest {

	Calculator calc=new Calculator();

	//@BeforeAll
	@BeforeEach
	public void init() {
		calc = new Calculator();
	}

	@After
	public void cleanup() {
		calc = null;
	}

	@Test()
	public void testAdd() {
		assertEquals
		(57.899998f, calc.add(12.3f, 45.6f));
	}

	@Test()
	public  void testDivision() {
     Assertions.assertThrows(ArithmeticException.class,()->{
    	 calc.division(20, 1);
     });	 	
    	 
     
	}

}
