package dev.danvega;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = scanner.nextLine();

        System.out.println("What is your email address?");
        String email = scanner.nextLine();

        // print to the console in the format of firstname,lastname,email
        System.out.println(firstName + "," + lastName + "," + email);
    }

}