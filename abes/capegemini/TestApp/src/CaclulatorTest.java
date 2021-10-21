import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaclulatorTest {

	Calculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ArithmeticException.class)
	public void testDivision() {
		assertEquals(20, calculator.division(20, 1));
		assertEquals(0, calculator.division(20, 25));
		// assertEquals(0.8f, calculator.division(20, 25),0.0f);

		assertEquals(678123345, calculator.division(678123345, 1));

		assertEquals(20, calculator.division(20, 0));
	}

	@Test
	public void testAddition() {
		assertEquals(25.0f, calculator.Addition(12.0f, 13.0f), 0.0f);
		assertEquals(25.7f, calculator.Addition(12.4f, 13.3f), 0.0f);
		assertEquals(22, calculator.Addition(10, 12), 0.0f);
	}
}
