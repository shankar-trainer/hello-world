package com.coforge.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            if(a<=0|| b<0)
                throw new InputMismatchException();
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.err.println(e);
        }
        catch (InputMismatchException e){
            System.err.println(e);
        }
    }
}
