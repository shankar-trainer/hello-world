package com.coforge.exception;

public class ExceptionExample1 {

    public static void main(String[] args) {

        String s=null;

        System.out.println("program starts");
        try {
//            System.out.println(10 / 0); //java.lang.ArithmeticException
            System.out.println(10 / 0); //java.lang.ArithmeticException
            System.out.println(s.length());
        }
        catch (ArithmeticException e){
            System.out.println(" divided by zero error  ");
        }
        catch (NullPointerException e){
            System.out.println("null error ");
        }
        catch (Exception e) {
            System.out.println("error is "+e.getMessage());
//            System.err.println("error is "+e.getMessage());
        }
        System.out.println("program ends ");
    }

}
