package edu.com;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MyCarTest {
    //Car car = Mockito.mock(Car.class);

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this); //without this you will get NPE
    }


    @Mock
   private Car car;

    @Test
    public void test() {
        //Assert.assertTrue(car instanceof Car);
        //double engineTemperature = car.getEngineTemperature();
        //Assert.assertEquals(0.0, engineTemperature, 0);
        car.driveTo("chennai");
        Mockito.verify(car).driveTo("chennai");
    }
}
