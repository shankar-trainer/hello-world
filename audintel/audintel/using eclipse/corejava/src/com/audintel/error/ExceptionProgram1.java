package com.audintel.error;

public class ExceptionProgram1 {

	public static void main(String[] args) {
		
		//System.out.println(1/0);
//java.lang.ArithmeticException: / by zero
		
		int array1[]= {1,2,3,4,5};
		//System.out.println(array1[5]);
		 //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds
		
		Integer x=null;
	//int p=	x.intValue();
	//java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()
	
		String var="abc";
		System.out.println(var.charAt(2));
		//System.out.println(var.charAt(3));
	//java.lang.StringIndexOutOfBoundsException: String index out of range: 3
		
		
		String s="123a";
		int parseInt = Integer.parseInt(s);
		// java.lang.NumberFormatException
		
  }
}
