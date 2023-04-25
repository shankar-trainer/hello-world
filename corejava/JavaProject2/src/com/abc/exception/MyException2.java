package com.abc.exception;

import java.util.Scanner;

/**
 * Created by shankar on 3/21/2023.
 */
public class MyException2 {

    static void  division(int a, int b) throws Exception
    {
        if(b==0) {
            try {
                throw new Exception("divided by zero error");
            } catch (Exception e) {
                System.out.println("division  method error " + e);
                throw  e;
            }
        }
       else
            System.out.println("Division result is "+(a/b));
    }

    public static void main(String[] args) {
        System.out.println("program starts ");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter tow no ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        try {
            division(x,y);

        } catch (Exception e) {
            System.out.println("main method error "+e);
        }
        finally{
            System.out.println("finally block called");
            sc.close();
        }
        System.out.println("program end  ");


    }



}
