package edu.chitkara.exception;

public class ExceptionProgram1 {

	public static void main(String[] args) {
		System.out.println("program start ");
		
		int ar[]= {1,2,3,44,5};
		//System.out.println(ar[5]);
		//java.lang.ArrayIndexOutOfBoundsException
		// java.lang.StringIndexOutOfBoundsException
		// java.lang.IndexOutOfBoundsException
		
		//System.out.println(10/0);
		//java.lang.ArithmeticException
		
		Integer x=null;
		//System.out.println(x.toString());
		//java.lang.NullPointerException
		
		String p="123a";
		//int a=Integer.parseInt(p);
		//java.lang.NumberFormatException
		//System.out.println(a++);
		
		String name="ram kumar";
		System.out.println(name.charAt(8));
		System.out.println(name.charAt(9));
		// java.lang.StringIndexOutOfBoundsException
		
		System.out.println("program end ");
		
	}
}
