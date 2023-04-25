package com.abc.exception;

/**
 * Created by shankar on 3/18/2023.
 */
public class ExceptionPrg1 {


    public static void main(String[] args) {
        System.out.println("program start ");
        int n1=10;
        int n2=2;
        int arr[]={4,55,6,7,8};


        try {
            System.out.println("division of " + n1 + " and " + n2 + "  is  :   " + (n1 / n2));//java.lang.ArithmeticException: / by zero
            System.out.println(" array no is "+arr[8]);
        }

        catch (ArithmeticException e){
            System.out.println("divided by zero error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index error");
        }

        catch (Exception e){
            System.out.println("error is "+e);
        }
        System.out.println("program ends ");
        }


}
