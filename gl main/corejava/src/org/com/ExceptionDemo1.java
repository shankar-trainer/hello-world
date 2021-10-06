package org.com;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("start of program");
		
		//System.out.println(10/0);//java.lang.ArithmeticException: / by zero
		
		//System.out.println(10.0f/0.0f);
		
		int ar[]={1,2,3,4,5};
		
		
		//System.out.println(ar[5]);// java.lang.ArrayIndexOutOfBoundsException: 5
		
		//java.lang.IndexOutOfBoundsException
		
		String s=null;
		
		//System.out.println(s.length());// java.lang.NullPointerException
		
		String var="hello";
		
		//System.out.println(var.charAt(5));
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 5
		
		String a="123a";
		
		int a1=Integer.parseInt(a);
		//java.lang.NumberFormatException:
			
		
		System.out.println("end  of program");
	}
}
