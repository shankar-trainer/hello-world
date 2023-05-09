package edu.chitkara.exception;

public class ExceptionProgram3 {

	public static void main(String[] args) {
		
		String name=null;

		try {
		System.out.println("name is "+name); 
		System.out.println("name length is "+name.length()); 
		}
		
		catch (NullPointerException e) {
			System.err.println("null exception");
		}
		catch (Exception e) {
			System.err.println("some error ");
		}
		
		
	}
}
