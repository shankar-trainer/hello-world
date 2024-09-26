package com.abc.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Properties;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class Test2 {
   Properties  properties;

	@BeforeEach
	void setUp() throws Exception {
		properties=Mockito.mock(Properties.class);
	}
	
	/*
	@Mock
	Properties  properties;

	@Before
	void setUp() throws Exception {
	 MockitoAnnotations.initMocks(properties);
	}
	*/
	
	@Test
	void test1() {
	  Mockito.when(properties.get(123)).thenReturn("ram kumar");
	  Mockito.when(properties.get(125)).thenReturn("ram kumar","suresh kumar","kamal kumar");
	  
	  Mockito.when(properties.get(124)).thenThrow(new RuntimeException("value not present for the key"));
	  assertEquals("ram kumar", properties.get(123));
	  assertEquals("kamal kumar", properties.get(125));
	  assertEquals("suresh kumar", properties.get(125));
	  try {
	  assertEquals("ram", properties.get(124));
	  }
	  catch (Exception e) {
		  System.err.println(e.getMessage());
	}
	  Mockito.verify(properties).get(123);
	}
}
