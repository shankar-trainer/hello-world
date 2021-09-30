package com.capgemini.wrapper;

public class WrapperDemo3 {

	public static void main(String[] args) {
		  String s1="100";
		  String s2="100";
		  
		   s1=s1+200; // no arithmetic operation
		              // string concatenation 
		   System.out.println(s1);
		   
		   int d1=Integer.parseInt(s2);
		   
		   d1=d1+200;
	
		   System.out.println(d1);
	   // parseXXX
		   // Integer.parseInt
		   //Float.parseFloat()
		   //Double.parseDouble()
	}
}
