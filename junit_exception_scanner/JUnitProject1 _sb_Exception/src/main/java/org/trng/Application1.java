package org.trng;

import java.util.Scanner;

public class Application1 {
    public static final String NAME = "Name: ";

    public static String readName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string ");
        String input = scanner.next();
        return NAME.concat(input);
    }
}
