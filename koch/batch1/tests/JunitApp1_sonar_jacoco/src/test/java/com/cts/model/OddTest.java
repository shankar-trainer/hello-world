package com.cts.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class OddTest {

	Odd odd;
	@BeforeEach
	public void init() {
		odd=new Odd();
	}
	
	@Test
	public void test1() {
		assertTrue(odd.checkOdd(3));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {11,3,13,15,19})
	public void test2(int p) {
		assertTrue(odd.checkOdd(p));
	}
	
	
	
}
