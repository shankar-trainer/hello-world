package com.coforge.exception;

public class ExceptionPrg2 {

	public static void main(String[] args) {
		System.out.println("program  starts");
		
		int ar[] = { 1, 2, 3, 4, 5 };
		String age="34a";
		try {
		 System.out.println(ar[2]);
		 System.out.println("Age is "+Integer.parseInt(age));
		}
		
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.err.println("array error at "+e.getMessage());
//		}
//		catch (NumberFormatException e) {
//			System.err.println("format error "+e.getMessage());
//		}
		
		catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("some error ");
			System.out.println(e.getMessage());
		}
		 System.out.println("program  ends");
	}
}
