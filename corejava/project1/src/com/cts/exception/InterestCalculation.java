package com.cts.exception;

import java.util.Scanner;

public class InterestCalculation {
    float amt;
    float rate;
    int time;
    Scanner scanner=new Scanner(System.in);

    float interest() throws Exception {
        System.out.println("enter amount");
        amt= scanner.nextFloat();
        if(amt<=0)
            throw new Exception("invalid amount");

        System.out.println("enter time");
        time= scanner.nextInt();

        if(time<=0)
            throw new Exception("invalid time");

        System.out.println("enter rate");
        rate= scanner.nextFloat();

        if(rate<=0)
//            throw new RuntimeException("invalid rate");
            throw new Exception("invalid rate");

        return  amt*rate*time/100;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Interest is "+new InterestCalculation().interest());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
