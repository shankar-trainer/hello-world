package edu.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class Car_Test {

	@Mock
	Car car;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	

	@Test
	void test() {
		assertTrue(car instanceof Car);
		assertEquals(0.0, car.getEngineTemperature());
		car.driveTo("chennai");

		Mockito.verify(car).driveTo("chennai");

	}

}
