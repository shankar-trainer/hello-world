package edu.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class MyClassTest {

	@Mock
	MyClass class1;
	
	@Mock
	Factorial fact;

	@BeforeEach
	void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void test() {
		when(class1.getUniqueId()).thenReturn(101);
		assertEquals(101, class1.getUniqueId());
	}
	
	@Test
	void test1() {
		
		when(fact.fact(5)).thenReturn(120);
		assertEquals(120,fact.fact(5));
		
	}

}
