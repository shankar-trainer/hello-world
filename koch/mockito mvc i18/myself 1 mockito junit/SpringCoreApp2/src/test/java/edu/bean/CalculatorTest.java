package edu.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	//  System.out.println("beforeall method");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	 
		//System.out.println("after all method");
	}
 Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
	 calculator=new Calculator();
	// System.out.println("before each called");
	}

	@AfterEach
	void tearDown() throws Exception {
	 calculator=null;
//	System.out.println("tear down called ");
	}

	@Test
	void testSum() {
	 assertEquals(33.8f, calculator.sum(11.3f, 22.5f));
		//fail("Not yet implemented");
	}

	@Test
	void testSubtraction() {
		assertEquals(30, calculator.subtraction(2147483640, 2147483610));
	}

	@Test
	void test1() {
		  assertTrue(10>6);
		  assertTrue( 111>100,"100>111");
	}
	
	
	
}
