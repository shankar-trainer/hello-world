package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test1Test {

    Test1 t;

    @BeforeEach
    public void setup(){
        t=new Test1();
    }

    @ParameterizedTest
    @ValueSource(ints = { 2,  4,  6,  8})
    public void evenorOddTest(int p) {
         assertTrue(t.evenorOdd(p));
    }

    @ParameterizedTest
    @ValueSource(ints = { 1,3,5,7,9})
    public void evenorOddTest1(int p) {
         assertFalse(t.evenorOdd(p));
    }

}
