package com.cts.exception;

public class ExceptionPrg2 {

    public static void main(String[] args) {
        System.out.println("start of program");
        String s=null;
        try {
            System.out.println(10 / 0);//java.lang.ArithmeticException: / by zero
            System.out.println(10 / 2);//java.lang.ArithmeticException: / by zero
            System.out.println(s.length());
        }
        catch (NullPointerException e){
            System.out.println("null value error");
        }
        catch (ArithmeticException e){
            System.out.println("divided by zero error");
        }
        catch (Exception e) {
//            System.err.println("some error "+e.getMessage());
            System.out.println("some error " + e.getMessage());
        }
        System.out.println("end of program");
    }
}

// ctrl +H  -- hierarchy
