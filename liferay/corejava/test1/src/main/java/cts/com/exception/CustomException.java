package cts.com.exception;

import java.util.Scanner;

public class CustomException {
    private int time;
    private float amount;
    private float rate;

    Scanner scanner;

    CustomException() {
       scanner=new Scanner(System.in);
    }

    float interestCalc() {
        System.out.println("enter amount");
        amount=scanner.nextFloat();
        if(amount<=0)
            throw new RuntimeException("invalid amount");

        System.out.println("enter time");
        time=scanner.nextInt();
        if(time<=0)
            throw new RuntimeException("invalid time");

        System.out.println("enter rate");
        rate=scanner.nextFloat();

        if(rate<=0)
            throw new RuntimeException("invalid rate");

        return  amount*rate*time/100;
    }

    public static void main(String[] args) {
        CustomException customException= new CustomException();
       try {
           System.out.println("interest is " + customException.interestCalc());
       }
       catch (RuntimeException e){
           System.err.println(e.getMessage());
       }
       finally {
           System.out.println("finally called");
           customException.scanner.close();
       }
    }
}
