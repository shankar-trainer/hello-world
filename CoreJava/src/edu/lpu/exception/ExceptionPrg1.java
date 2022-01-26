package edu.lpu.exception;

public class ExceptionPrg1 {

	public static void main(String[] args) {
		/*
		System.out.println(10/9);
		System.out.println(10/10);
		System.out.println(10/11);
		System.out.println(10/12);
		*/
		
		System.out.println("program starts ");
		int x=10;
		//int y=2;
		int y=0;
		try {
		System.out.println("Result is "+(x/y));
		}
		catch(Exception e) {
			//System.out.println(e);
			//System.out.println("divide by zero error");
			System.err.println("divide by zero error");
			System.err.println(e.getMessage());
			
			e.printStackTrace();
			
		}
		System.out.println("program ends ");
		
	}
}
