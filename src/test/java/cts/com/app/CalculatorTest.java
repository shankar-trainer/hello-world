package cts.com.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
	  calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	  calculator=null;
	}

	@Test
	void testAddition() {
          Assertions.assertEquals(44.5f, calculator.addition(22.2f, 22.3f));
          Assertions.assertEquals(234, calculator.addition(123, 111));
	}

	@Test
	void testSubtraction() {
	      Assertions.assertEquals(19.900002f, calculator.subtraction(22.2f, 2.3f),0.0f);
          Assertions.assertEquals(112, calculator.subtraction(123, 11),0);
	}

	@Test
	void testMultiplication() {
	}

	@Test
	void testDivision() {
	}

}
