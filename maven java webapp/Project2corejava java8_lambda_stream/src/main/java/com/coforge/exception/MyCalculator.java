package com.coforge.exception;

import java.util.Scanner;

public class MyCalculator {
    long power(int a, int b) throws Exception {
        long res = 1;
        if (a == 0 || b == 0)
            throw new Exception("n and p should not be zero.");
        if (a < 0 || b < 0)
            throw new Exception("n and p should not be negative.");

        for (int i = 1; i <= b; i++) {
            res = res * a;
        }
        return res;
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        //System.out.println(myCalculator.power(2, 3));
        Scanner scanner = new Scanner(System.in);

        int input[][] = new int[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(myCalculator.power(input[i][0], input[i][1]));
            }
            catch (Exception e)
            {
                System.out.println(e);

            }
        }
    }
}
