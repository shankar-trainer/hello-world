package com.example.mockito1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
//import org.mockito.Mockito;
import static  org.mockito.Mockito.*;
//import org.mockito.MockitoAnnotations;
import static org.mockito.MockitoAnnotations.*;

public class ICalcTest {

    @Mock
    Icalculator calculator1;

    @BeforeEach
    void setUp()
    {
//        MockitoAnnotations.initMocks(this);
        initMocks(this);
    }


    @Test
    void calcAddition()
    {
        calculator1.addition(11,12); // expect
//        Mockito.when(calculator1.addition(11,12)).thenReturn(33); //expect
        when(calculator1.addition(11,12)).thenReturn(33);//expect
        //Mockito.verify(this.calculator1, Mockito.times(1)).addition(11,12);  //use
        verify(this.calculator1, times(1)).addition(11,12);// verify
    }

    @Test
    void calcDivision()
    {
        calculator1.division(11,12);
        //Mockito.when(calculator1.division(11,12)).thenReturn(0);
        //Mockito.verify(this.calculator1, Mockito.times(1)).division(11,12);
        when(calculator1.division(11,12)).thenReturn(0);
        verify(this.calculator1, times(1)).division(11,12);
    }
    @Test
    void calcDivision1()
    {
        calculator1.division(11,0);
//        Mockito.when(calculator1.division(11,0)).thenThrow(ArithmeticException.class);
        when(calculator1.division(11,0)).thenThrow(ArithmeticException.class);
//        Mockito.verify(this.calculator1, Mockito.times(1)).division(11,0);        Mockito.when(calculator1.division(11,0)).thenThrow(ArithmeticException.class);
        verify(this.calculator1, times(1)).division(11,0);
    }


}
