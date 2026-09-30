package cts.com.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll called");
	}

	Calculator calculator;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach called");
	 calculator=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach called");
	}

	@Test
	void testAddition() {
		assertEquals(5, calculator.addition(2, 3));
	}

	@Test
	void testSubtraction() {
		assertEquals(10, calculator.subtraction(30, 20));
	}

	@Test
	void testMultiplication() {
		assertEquals(6, calculator.multiplication(2, 3));
	}

	@Test
	void testDivision() {
		assertEquals(1, 10/9);
		assertEquals(1, calculator.division(10, 10));
		assertEquals(0, calculator.division(10, 11));
		assertThrows(ArithmeticException.class, ()->{
	                            calculator.division(10, 0);
		});
	}

}
