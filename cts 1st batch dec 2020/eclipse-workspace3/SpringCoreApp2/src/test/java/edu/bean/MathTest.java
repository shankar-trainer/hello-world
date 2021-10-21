package edu.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MathTest {

	@InjectMocks
	MathApplication mathApplication;

	@Mock
	CalculatorService calculatorService;

	@BeforeEach
	void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void addTest() {

		Mockito.when(calculatorService.addition(10.0, 20.0)).thenReturn(30.0);
		assertEquals(mathApplication.addMethod(10.0, 20.0), 30.0);

		Mockito.verify(calculatorService, Mockito.atLeastOnce()).addition(10.0, 20.0);
	}

	@Test
	public void divIntTest() {

		Mockito.doThrow(new RuntimeException("invalid no")).when(calculatorService.divisionInt(10, 0));

		Mockito.when(calculatorService.divisionInt(10, 2)).thenReturn(5);

		assertEquals(mathApplication.addMethod(10.0, 20.0), 30.0);

		Mockito.verify(calculatorService, Mockito.atLeastOnce()).addition(10.0, 20.0);
	}

}
