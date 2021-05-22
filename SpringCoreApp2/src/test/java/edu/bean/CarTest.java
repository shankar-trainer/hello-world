package edu.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CarTest {

	Car car;

	@BeforeEach
	void setUp() throws Exception {
		car = Mockito.mock(Car.class);
	}

	@Test
	void test() {
		assertTrue(car instanceof Car);
		assertEquals(0.0, car.getEngineTemperature());
		car.driveTo("chennai");

		Mockito.verify(car).driveTo("chennai");

	}

}
