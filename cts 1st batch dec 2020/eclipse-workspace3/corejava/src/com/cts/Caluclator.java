package com.cts;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Caluclator {

	Scanner scanner = new Scanner(System.in);
	float n1, n2;

	float addition() throws Exception, FileNotFoundException {

		System.out.println("Enter 1st No");
		n1 = scanner.nextFloat();

		try {
		if (n1 <= 0)
			throw new Exception("invalid  no");
		}
		catch (Exception e) {
			System.err.println("in method "+e.getMessage());
			throw e;
		}
		System.out.println("Enter 2nd No");
		n2 = scanner.nextFloat();

		if (n2 <= 0)
			throw new FileNotFoundException("invalid  no");

		return n1 + n2;
	}

	public static void main(String[] args)// throws Exception
	{
		System.out.println("program starts ");
		try {
			System.out.println("sum is " + new Caluclator().addition());
		} catch (Exception e) {

			System.out.println("error at main "+e.getMessage());
			//System.err.println("error is " + e.getMessage());
		} finally {
			System.out.println("finally works  ");
		}
		System.out.println("program ends ");
	}
}
