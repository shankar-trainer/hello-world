package com.cts.error;

public class ExceptionTest1 {


	public static void main(String[] args) {
		
		String s="11122";
		
		try {
		System.out.println("char at 5th position "+s.charAt(5));
		int p1=Integer.parseInt(s);
		System.out.println("Result is "+p1/2);
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.err.println("string index error at "+e.getMessage());
		}
		catch (NumberFormatException e) {
			System.err.println("invalid number ");
		}
		catch (Exception e) {
			System.out.println("error is "+e);
		}
		
	}
}
