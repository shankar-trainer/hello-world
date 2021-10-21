package com.cts;

import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		System.out.println("program starts ");
		try {
			int x = 10 / 0;
			int ar[] = { 11, 22, 33, 44, 55 };

			System.out.println(ar[5]);
			System.out.println(x);
		}

//		catch (ArithmeticException e) {
//			System.err.println(e.getMessage());
//		}
//
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println(e.getMessage());
//		}

		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			//System.err.println(e.getMessage());
			System.out.println(e.getMessage());
		}
		
		System.out.println("program ends ");
	}

}
