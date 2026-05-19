package com.abc.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CarTest {

	Car car;
	
	@BeforeEach
	void setUp() throws Exception {
	 car=Mockito.mock(Car.class);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNeedFuel() {
		assertEquals(false, car.needFuel());
	}

	@Test
	void testGetEngineTemperature() {
		assertEquals(0.0, car.getEngineTemperature());
	}

	@Test
	void testDriveTo() {
	   car.driveTo("delhi");
	   Mockito.verify(car).driveTo("delhi");
	}

}
