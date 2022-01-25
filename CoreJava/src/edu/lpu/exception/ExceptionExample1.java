package edu.lpu.exception;

public class ExceptionExample1 {

	public static void main(String[] args) {
		System.out.println("program starts ");
		int x=10;
		float p1=989.00f;
		
		System.out.println(p1/0);
		//System.out.println(x/0);//ArithmeticException
		System.out.println("hi.."+(x/0.0));//Infinity
		
		int ar[]= {1,2,3,4,5};
		
		//System.out.println(ar[5]);
		//ArrayIndexOutOfBoundsException
		
		Integer x1=0;
		Integer x2=null;
	  
		String s1=null;
	  
		 //System.out.println(s1.length());//NullPointerException 
		 
		 String p="hello";
		 //System.out.println(p.charAt(5));//StringIndexOutOfBoundsException
		 
		 String cost="878a";
		 int cost1=Integer.parseInt(cost);//NumberFormatException
		  
		 System.out.println("cost is "+cost1);
		
		 System.out.println("program ends ");
	}
}




