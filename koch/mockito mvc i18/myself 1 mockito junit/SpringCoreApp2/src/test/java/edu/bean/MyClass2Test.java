package edu.bean;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

public class MyClass2Test {

	MyClass class1;
	

	@BeforeEach
	void init() {
//		MockitoAnnotations.initMocks(this);
	class1=new MyClass();
	}

	@Test
	void test() {
	//	when(class1.getUniqueId()).thenReturn(101);
		assertEquals(101, class1.getUniqueId());
	}

}
