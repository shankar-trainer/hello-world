package com.abc.exception;

import java.util.Scanner;

public class InterestCalculation1 {

    float amt;
    float rate;
    int time;
    Scanner sc;

    public InterestCalculation1() {
        sc = new Scanner(System.in);
    }

    float calc() throws Exception {
        System.out.println("Enter amount");
        amt = sc.nextFloat();

        if (amt <= 0)
            throw new Exception("invalid amount");

        System.out.println("Enter rate");
        rate = sc.nextFloat();
        if (rate <= 0)
            throw new Exception("invalid rate");

        System.out.println("Enter time");
        time = sc.nextInt();
        if (time <= 0)
            throw new Exception("invalid time");
        return (amt * rate * time / 100);
    }


    public static void main(String[] args) {
        System.out.println("program starts ");
        InterestCalculation1 interestCalculation = new InterestCalculation1();
        try {
            float interest_amt = interestCalculation.calc();
            System.out.println("Interest is " + interest_amt);
            System.out.println("program ends  ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
