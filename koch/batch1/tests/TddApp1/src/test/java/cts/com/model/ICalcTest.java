package cts.com.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ICalcTest {

	@Mock
	ICalculator calculator;
	
	@BeforeEach
	public void init() {
		//Mockito.mock(ICalculator.class);
	 MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void divisionTest() {
		calculator.division(11, 11);
		Mockito.when(calculator.division(11, 11)).thenReturn(1);
		Mockito.verify(calculator).division(11, 11);
	}
	
	@Test
	public void divisionTest1() {
		calculator.division(11, 0);
		Mockito.when(calculator.division(11, 0)).thenThrow(ArithmeticException.class);
		Mockito.verify(calculator).division(11, 0);
	}
	
	
	@Test
	public void additionTest() {
		calculator.addition(11, 22);
		Mockito.when(calculator.addition(11, 22)).thenReturn(33);
		Mockito.verify(calculator).addition(11, 22);
	}
	@Test
	public void subtractionTest() {
		calculator.subtraction(11, 22);
		Mockito.when(calculator.subtraction(11, 22)).thenReturn(-11);
		Mockito.verify(calculator).subtraction(11, 22);
	}
	
}
