package edu.example;

import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Test1 {

	List list1;
	@BeforeEach
	void setUp() throws Exception {
	 list1=Mockito.mock(List.class);
	}	
	
	@Test
	void listTest1() {
		list1.add("delhi");
		
		
		Mockito.when(list1.get(0)).thenReturn("delhi");
		Mockito.when(list1.get(1)).thenThrow(new RuntimeException("element not present"));
		
		System.out.println(list1.get(0));
		//System.out.println(list1.get(1));
		Mockito.verify(list1);
	}
	
}
