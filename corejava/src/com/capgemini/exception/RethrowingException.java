package com.capgemini.exception;

import java.util.Scanner;

public class RethrowingException {
	private int id;
	private String name;
	private float salary;

	Scanner sc;

	public RethrowingException() {
		sc = new Scanner(System.in);
	}

	public void input() throws Exception {

		try {
			System.out.println("Enter id ");
			id = sc.nextInt();
			if (id <= 0)
				throw new Exception("invalid id ");
		} catch (Exception e) {
			System.err.println("error at input method " + e.getMessage());
			throw e;
		}

		try {
			System.out.println("Enter name ");
			sc.nextLine();
			name = sc.nextLine();// nextLine()
			if (name.isEmpty())
				throw new Exception("invalid name ");
		} catch (Exception e) {
			System.err.println("error at input method " + e.getMessage());
			throw e;
		}
		try {
			System.out.println("Enter salary ");
			salary = sc.nextFloat();
			if (salary <= 0)
				throw new Exception("invalid salary ");
		} catch (Exception e) {
			System.err.println("error at input method " + e.getMessage());
			throw e;
		}
	}

	@Override
	public String toString() {
		return "\nUser Data \n \tid=" + id + "\n\tname=" + name + "\n\tsalary=" + salary;
	}

	public static void main(String[] args) {
		RethrowingException exception = new RethrowingException();
		try {
			exception.input();
			System.out.println(exception);
		} catch (Exception e) {
			System.err.println("exception at main method " + e.getMessage());
		}
	}

}
