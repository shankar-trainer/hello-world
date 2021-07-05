package org.cognizant.error;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3};
		
		//System.out.println(ar[3]);// java.lang.ArrayIndexOutOfBoundsException
		
		//System.out.println(10/0);
		System.out.println(10.0/0);
		System.out.println(10/0.0);
		System.out.println(10/0.0f);
		
		String s=null;
		//System.out.println(s.length());// java.lang.NullPointerException
		
		String s1="hello";
		//char c1=s1.charAt(10);// java.lang.StringIndexOutOfBoundsException
		
		String no1="100a";
		int p=Integer.parseInt(no1);
		//java.lang.NumberFormatException

		
	}
}
