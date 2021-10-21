package org.com.capegemini;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

	Factorial fact1;
	
	@Before
	public void setUp() throws Exception {
	fact1=new Factorial();
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFactorial() {
	   assertEquals(120, fact1.factorial(5));
	}

}
