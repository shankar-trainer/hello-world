package com.coforge.exception;

public class ExceptionPrg2 {

    public static void main(String[] args) {
        System.out.println("program starts ");

        int ar[] = {1, 2, 3, 4, 5};
        String name=null;
        try {
            System.out.println("name length is "+name.length());
            System.out.println(ar[5]);
        }
        catch (ArithmeticException e){
            System.err.println("divided by zero\n"+e.getMessage() );
        }
        catch (NullPointerException e){
            System.err.println("null error \n"+e.getMessage() );
        }
        catch (Exception e){
            System.out.println("some error "+e.getMessage());
        }

        System.out.println("program ends");
    }
}
