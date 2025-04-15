package mockito;

import org.com.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarTest2 {
    //Car car = Mockito.mock(Car.class);

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
