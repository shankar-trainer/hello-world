package edu.chitkara.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuestion1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			System.out.println(x / y);
		} catch (InputMismatchException|ArithmeticException e) {
			System.err.println(e);
		} 
		scanner.close();

	}
}
