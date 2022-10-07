package com.montran.error;

public class ErrorPrg1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4};
		//System.out.println(ar[4]);//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(ar[3]);
		
		System.out.println(1.0/0);
		System.out.println(-1.0/0);
		System.out.println(1.0f/0);

		//System.out.println(1/0);//ArithmeticException
		
		Integer x=null;
		Character c=null;
		Float f=null;
		
		//int primitive data type  -- no attribute  no methods 
		//Integer  -- class or reference variable  
		
		String s=null;
		//System.out.println(s.length());//NullPointerException
		
		String name="ram kumar";
		System.out.println(name.length());
		//System.out.println(name.charAt(9));//java.lang.StringIndexOutOfBoundsException
		
		String p1="132332a";
		int j=Integer.parseInt(p1);
		//System.out.println(j/2);//java.lang.NumberFormatException
		
		
	}
}
