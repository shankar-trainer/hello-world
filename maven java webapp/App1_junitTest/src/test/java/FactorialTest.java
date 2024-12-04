import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testGetFactorial() {
		
		assertEquals(120, Factorial.getFactorial(5));

	}

}
