
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.com.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calc;

	// @BeforeAll
	@BeforeEach
	public void init() {
		calc = new Calculator();
	}

	@AfterEach
	public void cleanup() {
		calc = null;
	}

	@Test()
	public void testAdd() {
		assertEquals(57.0f, calc.add(12.0f, 45.0f), 0.0);
	}

	@Test()
	public void testDivision() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			Assertions.assertEquals(20, calc.division(20, 0));
		});
	}
	
	@Test()
	public void testDivision1() {
			Assertions.assertEquals(20, calc.division(20, 1));
	}
}
