package com.coforge.exception;

import java.util.Scanner;

public class InterestCalculation {
    private float amount;
    private float rate;
    private int time;

    Scanner scanner;

    public InterestCalculation() {
        scanner = new Scanner(System.in);
    }

    float interestCalculation() throws Exception {
        try {
            System.out.println("enter amount");
            amount = scanner.nextFloat();
            if (amount <= 0)
                throw new Exception("invalid amount");

            System.out.println("enter rate");
            rate = scanner.nextFloat();
            if (rate <= 0)
                throw new Exception("invalid rate");

            System.out.println("enter time");
            time = scanner.nextInt();
            if (time <= 0)
                throw new Exception("invalid time");
        } catch (Exception e) {
            System.err.println("error at interestCalculation method "+e);
            throw e;
        }

        return amount * rate * time / 100;
    }

    public static void main(String[] args) {
        InterestCalculation calculation = new InterestCalculation();
        float interest = 0;
        try {
            interest = calculation.interestCalculation();
        } catch (Exception e) {
            System.err.println("exception at main method "+e);
        }
        System.out.println("interest is " + interest);

    }
}
