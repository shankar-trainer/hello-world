package cts.com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenOrOddTest {

	EvenOrOdd evenodd;

	@BeforeEach
	void setUp() throws Exception {
		evenodd = new EvenOrOdd();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	// @Test
	@ParameterizedTest
	@ValueSource(ints = { 10, 12, 32, 24, 52, 62, 78, 82 })
	void testEvenCheck1(int n) {
		assertTrue(evenodd.evenCheck(n));
	}

	@Test
	@Timeout(value = 2000)
	@Ignore(value = "ignore this test")
	void testEvenCheck() {
		assertTrue(evenodd.evenCheck(10), "11 is not even no ");
		assertTrue(evenodd.evenCheck(3455446644L));
		assertTrue(evenodd.evenCheck(156));
		assertTrue(evenodd.evenCheck(254));
		assertFalse(evenodd.evenCheck(253));
	}

	@Test
	void testOddCheck() {
		assertTrue(evenodd.oddCheck(11));
		assertTrue(evenodd.oddCheck(3455446643L));
		assertTrue(evenodd.oddCheck(153));
		assertTrue(evenodd.oddCheck(251));
		assertFalse(evenodd.oddCheck(252));
	}

	@Test
	void testFactorial() {

		assertSame(1, evenodd.factorial(1));
		assertSame(1, evenodd.factorial(0));
		assertSame(120, evenodd.factorial(5));

	}

}
