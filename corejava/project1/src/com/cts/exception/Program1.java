package com.cts.exception;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        String company=null;

        Scanner scanner=new Scanner(System.in);

        try{
            System.out.println("enter company name");
            company= scanner.nextLine();
            System.out.println("company name is "+company);
            System.out.println("company name length is "+company.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
            System.out.println("finally block called");
        }

    }
}
