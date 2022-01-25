package edu.lpu.exception;

public class ExceptionPrg1 {

	
	public static void main(String[] args) {
		int x=10;
		int ar[]= {11,22,33,44,55};
		try {
		System.out.println("Result is "+x/0);
		System.out.println("array 5 the element is  "+ar[5]);
		}
		catch (Exception e) {
		
			System.out.println("error  "+e);
			System.out.println("divided by zero error ");
		}
	}
}
