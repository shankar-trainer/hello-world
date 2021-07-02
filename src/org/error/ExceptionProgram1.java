package org.error;

public class ExceptionProgram1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3};
		//System.out.println(ar[3]);	//java.lang.ArrayIndexOutOfBoundsException: 3

		String s=null;
		//System.out.println(s.length());
		//java.lang.NullPointerException
	
		String s2="hello";
		//System.out.println(s2.charAt(5));
		// java.lang.StringIndexOutOfBoundsException
		
		String no1="1234ab";
	int p=	Integer.parseInt(no1);
		System.out.println(p/2);//java.lang.NumberFormatException
	}
}
