package com.cts;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int x = 10 / 10; // java.lang.ArithmeticException
			System.out.println(x);
			String s = null;
			System.out.println(s.length());
		} 
		
		catch (ArithmeticException e) {
			System.out.println("divison error ");
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			int ar[] = { 12, 3, 4, 5 };
			System.out.println(ar[5]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index error  ");
			System.out.println("array index error  "+e.getMessage());
			System.out.println(e);
			
			e.printStackTrace();
		}
	}
}
