package com.cts.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeNoTest {
PrimeNo pn;
	
	@BeforeEach
	void setUp() throws Exception {
	pn=new PrimeNo();
	}

	//@Test
	@ParameterizedTest
	@ValueSource(ints= {1,2,3,4,5,6,7,8,9})
	
	void test(int p) {
		assertTrue(pn.Prime(p));
	}

}
