package com.abc.exception;

import java.util.Scanner;

/**
 * Created by shankar on 3/21/2023.
 */
public class MyException1 {

    static int division(int a, int b)//throws Exception
    {
        if(b==0) {
            try {
                throw new Exception("divided by zero error");
            } catch (Exception e) {
                System.out.println("division  method error " + e);
            }
        }
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("program starts ");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter tow no ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        try {
            int res=division(x,y);
            System.out.println("division of "+x+" and "+y+" is "+res);
        } catch (Exception e) {
            System.out.println("main method error "+e);
            e.printStackTrace();
        }
        finally{
            System.out.println("finally block called");
            sc.close();
        }
        System.out.println("program end  ");


    }



}
