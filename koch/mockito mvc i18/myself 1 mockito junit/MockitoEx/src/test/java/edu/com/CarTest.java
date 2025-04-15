package edu.com;

import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car = Mockito.mock(Car.class);

    @Test
    public void test() {
        assertTrue(car instanceof Car);
        double engineTemperature = car.getEngineTemperature();
        assertEquals(0.0, engineTemperature);
        car.driveTo("chennai");
        Mockito.verify(car).driveTo("chennai");
    }
}
