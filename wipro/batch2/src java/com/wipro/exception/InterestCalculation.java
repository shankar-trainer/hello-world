package com.wipro.exception;

import java.util.Scanner;

public class InterestCalculation {
    Scanner sc;
    float amt;
    float rate;
    int time;

    public InterestCalculation() {
        this.sc = sc = new Scanner(System.in);
    }

    float interest() {
        System.out.println("Enter amount");
        amt = sc.nextFloat();
        try {
            if (amt <= 0)
                throw new RuntimeException("invalid amount\namount is -ve or 0");
        }
        catch (Exception e){
            System.err.println("inside interest method error is "+e.getMessage());
            throw e;// rethrowing exception
        }
        System.out.println("Enter rate");
        rate = sc.nextFloat();
        if(rate<=0)
            throw new RuntimeException("invalid rate\nrate is -ve or 0");

        System.out.println("Enter time");
        time = sc.nextInt();
        if(time<=0)
            throw new RuntimeException("invalid time\ntime is -ve or 0");
        return amt*rate*time/100;
    }

    public static void main(String[] args) {
        System.out.println("program  starts ");
        InterestCalculation interestCalculation=new InterestCalculation();
        try {
        float interest=interestCalculation.interest();
        System.out.println(" interest is "+interest);
        }
        catch (Exception e){
            System.err.println("in main method error is "+e.getMessage());
            //System.err.println("cause is  "+e.getCause());
            e.printStackTrace();
        }
        System.out.println("program ends ");
    }
}
