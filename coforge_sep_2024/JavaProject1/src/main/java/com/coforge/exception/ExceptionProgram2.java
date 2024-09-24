package com.coforge.exception;

public class ExceptionProgram2 {

    public static void main(String[] args) {

        System.out.println("program starts ");
        int ar[] = {11, 2, 3, 4,};
        try {
            System.out.println("5 element " + ar[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.err.println(e.getMessage());
            System.err.println(" wrong index error ");
        }

        String s = null;

        try {
            System.out.println(s.length());
            System.out.println("result is " + (10 / 0));//java.lang.ArithmeticException
        } /*catch (ArithmeticException e) {
            System.err.println("divided by zero error ");
            //System.out.println("some error "+e.getMessage());
            // e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("null value error  ");
        } */

        catch (ArithmeticException | NullPointerException e){
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println("some other error " + e);
        }

        System.out.println("program ends  ");


    }
}
