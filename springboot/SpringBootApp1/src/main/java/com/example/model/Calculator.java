package com.example.model;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.stereotype.Component;

/**
 * Created by shankar on 4/18/2023.
 */
@Component(value = "calculator")
public class Calculator {

    public int addition(int a, int b) {
        System.out.println("sum is " + (a + b));
        return a + b;
    }

    public int subtraction(int a, int b) {
        System.out.println("subtraction is " + (a + b));
        return a + b;
    }

    public int multiplication(int a, int b) {
        System.out.println("multiplication is " + (a + b));
        return a * b;
    }

    public int division(int a, int b) throws IllegalAccessException {
        if(b==0)
            throw new IllegalAccessException("divided by zero");
        System.out.println("division is " + (a + b));
        return a / b;
    }


}
