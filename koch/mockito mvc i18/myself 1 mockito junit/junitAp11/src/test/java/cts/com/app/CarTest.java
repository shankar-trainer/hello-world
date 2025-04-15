package cts.com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class CarTest {

	/*
	 * Car car;
	 * 
	 * @BeforeEach void setUp() throws Exception { car = Mockito.mock(Car.class); }
	 */

	@Mock
	Car car;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals(false, car.needFuel());
		assertEquals(0.0, car.getEngineTemperature());
		car.driveTo("delhi");

		Mockito.verify(car).driveTo("delhi");
	}

}
