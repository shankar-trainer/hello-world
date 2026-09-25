package com.cts.model;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }
    public int subtraction(int a, int b) {
        return a - b;
    }
    public int division(int a, int b) {
        if(b==0)
            throw new RuntimeException
                    ("denominator cannot be zero");
        return a/b;
    }
}

