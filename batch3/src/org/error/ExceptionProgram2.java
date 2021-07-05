package org.error;

public class ExceptionProgram2 {

	public static void main(String[] args) {
		int ar[]= {1,2,3};
		try {
		System.out.println(ar[3]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index error ");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally block executed");
		}

	}
}
