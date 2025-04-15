package com.packt.bestpractices.matcher;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FacadeTest {

	@Mock PrinterService mockService;
	Facade facade;
	
	@Before
	public void setUp() throws Exception {
		facade = new Facade(new Decorator(), mockService);
	}

	@Test
	public void test() {
		String input = "hello";
		doNothing().when(mockService).print(anyString());
		facade.process(input);
		verify(mockService).print(anyString());
	}

}
