package com.capgemini;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyClassTest {

	MyClass class1;

	@BeforeEach
	public void init() {
		class1 = new MyClass();
	}

	@Test()
	public void testExceptionIsThrown() throws IllegalArgumentException {
		assertEquals(200, class1.multiply(1000, 5));
	}

	@Test
	public void testMultiply()  {
		assertEquals(5, class1.multiply(10, 2));
	}
}
