package cts.com.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CarTest {

	//Car car=Mockito.mock(Car.class);
	
	@Mock
	Car car;
	
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testCar() {
        Assertions.assertTrue(car instanceof Car);

		double enginezTemperature = car.getEnginezTemperature();
		Assertions.assertEquals(0.0, enginezTemperature,0);
		Assertions.assertEquals(false, car.needsFuel());
		car.driveTo("chennai");
		Mockito.verify(car).driveTo("chennai");
		
	}
	
	
}
