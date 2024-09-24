package com.coforge.exception;

import java.util.Scanner;

public class InterestCalculation {
    private float amt;
    private float rate;
    private int time;
    Scanner scanner;

    public InterestCalculation() {
        scanner=new Scanner(System.in);
    }

    float interest(){
        System.out.println("Enter amount");
        amt=scanner.nextInt();
        if(amt<=0)
            //throw new ArithmeticException("invalid amount");
            throw new RuntimeException("invalid amount");

        System.out.println("Enter rate");
        rate=scanner.nextFloat();
        if(rate<=0)
            throw new RuntimeException("invalid rate");

        System.out.println("Enter time");
        time=scanner.nextInt();
        if(time<=0)
            throw new RuntimeException("invalid time");

        return  amt*rate*time/100;

    }

    public static void main(String[] args) {
        System.out.println("program starts ");
        try {
            System.out.println("Interest is " + new InterestCalculation().interest());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("program ends  ");
    }

}
