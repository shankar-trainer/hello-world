package edu.chitkara.exception;

public class ExceptionProgram2 {

	public static void main(String[] args) {
		System.out.println("program start ");

		int ar[] = { 1, 2, 3, 44, 5 };
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		
		String s=null;
		
		try {
			System.out.println(ar[5]);
			System.out.println("length is "+s.length());
		} catch (Throwable e) {
			System.out.println(" array index error");
			System.err.println(" array index error");
		}
		System.out.println("program ends ");

	}
}
