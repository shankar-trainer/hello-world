package com.capegemini;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	int first_number;
	int second_number;
	double result;

	public Number(int first_number, int second_number) {
		super();
		this.first_number = first_number;
		this.second_number = second_number;
	}

	void add() {
		result = first_number + second_number;
	}

	void sub() {
		result = first_number - second_number;
	}

	void mul() {
		result = first_number * second_number;
	}

	void div() throws ArithmeticException {
		if (second_number == 0)
			throw new ArithmeticException("second no is zero");
		else
			result = first_number / second_number;
	}

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter two number");
			Number number = new Number(scanner.nextInt(), scanner.nextInt());

			System.out.println("Select The Right Choice");

			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");

			int ch = scanner.nextInt();
			switch (ch) {
			case 1:
				number.add();
				System.out.println("Addition is " + number.result);
				break;

			case 2:
				number.sub();
				System.out.println("Subtraction is " + number.result);
				break;
			case 3:
				number.mul();
				System.out.println("Multiplication is " + number.result);
				break;
			case 4:
				number.div();
				System.out.println("Division is " + number.result);
				break;
            default:
            	System.out.println("Wrong operation input");
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println(" Input Error   ");
		}

	}
}
