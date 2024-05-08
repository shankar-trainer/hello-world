package com.wipro.exception;

import java.util.Scanner;

public class Exception_Finally {

    static void division(int n1, int n2){
        System.out.println(" division result is "+n1/n2);
    }

    public static void main(String[] args) {
        /*System.out.println(1/0.0);//
        System.out.println(-1/0.0);//
        System.out.println(1/0);
        */
        System.out.println("[program starts ");
        Scanner sc=null;
        try {
        sc=new Scanner(System.in);
        System.out.println("Enter two no ");
        int a=sc.nextInt();
        int b=sc.nextInt();
            division(a, b);
        }
        catch(ArithmeticException e){
            System.err.println("Error is "+e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("finally block called ");
        }
        System.out.println("program ends  ");
    }
}
