package com.coforge.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MyTest {

    int ar1[];
    int ar2[];

    @BeforeEach
    public void init() {
        ar1 = new int[]{1, 2, 3, 4, 5, 6};
        ar2 = new int[]{1, 2, 3, 4, 5, 6};
    }

    @Test
    public void testArray() {
        //Assertions.assertEquals(ar1, ar2);//
        //Assertions.assertSame(ar1, ar2);

        Assertions.assertArrayEquals(ar1, ar2);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void testParametersEven(int x) {
//        Assertions.assertEquals(0, x%2);
        Assertions.assertEquals(0, x % 2, "is even number");
    }

    @Test
    public void stringTest(){
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        Assertions.assertSame(s1, s2);
        Assertions.assertNotSame(s1, s3);
        Assertions.assertEquals(s1, s3);
    }
}
