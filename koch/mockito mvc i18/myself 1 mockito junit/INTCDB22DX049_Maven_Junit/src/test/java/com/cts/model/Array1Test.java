package com.cts.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Array1Test {

	private Array1 array1;
	private Array1 array2;

	@BeforeEach
	void setUp() throws Exception {
		array1 = new Array1();
		array2 = new Array1();

	}

	@Test
	void testMarks() {
		array1.setMarks(new int[] { 1, 2, 3, 4, 5, 6 });
		array2.setMarks(new int[] { 1, 2, 3, 4, 5, 6 });
		int ar1[] = { 1, 2, 3 };
		int ar2[] = { 1, 2, 3 };
		assertArrayEquals(ar1, ar2);

		assertArrayEquals(array1.getMarks(), array2.getMarks());

	}

	@Test
	public void testStringSame() {
		assertSame("hello", "hello");
		assertSame("hello", new String("hello"));
		assertEquals("hello", "hello");

	}

}
