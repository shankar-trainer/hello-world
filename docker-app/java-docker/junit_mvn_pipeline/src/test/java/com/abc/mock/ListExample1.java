package com.abc.mock;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListExample1 {

	List<String> citylist;

	@BeforeEach
	void init() {
		citylist = Mockito.mock(List.class);
	}

	@Test
	void listTest() {
		citylist.add("delhi");
		Mockito.when(citylist.get(0)).thenReturn("delhi");  // stubbing 
		Mockito.when(citylist.get(1)).thenThrow(new RuntimeException("element not present"));
		
		Mockito.verify(citylist);  // verification
	}

}
