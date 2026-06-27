package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator=new Calculator();
    }
    @Test
    public void additionTest(){
       float result= calculator.addition(11.2f,12.3f);
        Assertions.assertEquals(23.5,result);
    }

    @Test
    public void subtractionTest(){
       float result= calculator.subtraction(22.2f,12.3f);
        Assertions.assertEquals(9.90000057220459,result);
    }

    @Test
    public void multiplicationTest(){
       float result= calculator.multiplication(2.2f,3.3f);
        Assertions.assertEquals(7.26f,result);
    }

    @Test
    public void divisionTest(){
       float result= calculator.division(2.2f,3.3f);
        Assertions.assertEquals(0.6666667f,result);
        Assertions.assertEquals(Float.POSITIVE_INFINITY,calculator.division(10.0f,0));

        Assertions.assertThrows(ArithmeticException.class,()->{
            int res=(10/0);

            //calculator.division(10,0)
        });

        Assertions.assertEquals(Float.POSITIVE_INFINITY, calculator.division(10,0));

    }


}
