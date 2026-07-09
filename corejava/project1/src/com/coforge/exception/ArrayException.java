package com.coforge.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {

    public String getPriceDetails() {
        int ar[];
        System.out.println("Enter the number of elements in the array");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        ar = new int[size];
        System.out.println("Enter the price details");
        for (int i = 0; i < ar.length; i++) {
            try {
                ar[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                return "Input was not in the correct format";
            }
        }

        try {
            System.out.println("Enter the index of the array element you want to access");
            int index = scanner.nextInt();
            return "The array element is " + ar[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        }
    }

    public static void main(String[] args) {
        try {
           String s= new ArrayException().getPriceDetails();
            System.out.println(s);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
