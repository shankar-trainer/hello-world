package mockito;

import org.com.Car;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CarTest {

    Car car = Mockito.mock(Car.class);

    @Test
    public void test() {
        Assert.assertTrue(car instanceof Car);
        double engineTemperature = car.getEngineTemperature();
        Assert.assertEquals(0.0, engineTemperature, 0);
        car.driveTo("chennai");
        Mockito.verify(car).driveTo("chennai");
    }
}
