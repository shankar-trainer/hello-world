package question;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FuelConsumptionTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    public void calculateFuelConsumptionTest(String input1, String expected1, String input2, String expected2) {

        String ar[] = FuelConsumption.calculateFuelConsumption(Double.valueOf(input1), Double.valueOf(input2));

        assertEquals(Double.valueOf(expected1), Double.valueOf(ar[0]));
        assertEquals(Double.valueOf(expected2), Double.valueOf(ar[1]));
        System.out.println(expected1+"... "+expected2);
    }

}