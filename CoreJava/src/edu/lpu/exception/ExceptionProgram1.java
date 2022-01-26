package edu.lpu.exception;

public class ExceptionProgram1 {

	public static void main(String[] args) {
		
		System.out.println(1.0/0);//Infinity
		System.out.println(-1.0/0);//-Infinity
		//System.out.println(1/0);//ArithmeticException
		
		int ar[]= {1,2,3,4,5};
		
		//System.out.println(ar[5]); //ArrayIndexOutOfBoundsException
		
		String s1=null;
		
		//System.out.println(s1.concat("aaa"));//NullPointerException
		
		Integer p1=0;
		System.out.println(p1.intValue());
		Integer p2=null;
		//System.out.println(p2.intValue());//NullPointerException
		
		String s2="hello";
		//System.out.println(s2.charAt(5)); //StringIndexOutOfBoundsException
		
		
		String z="1234ab";
		
       int k=Integer.parseInt(z);//Nu/mberFormatException 
      
		
		
	}
}
