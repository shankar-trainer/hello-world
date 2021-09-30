package com.capgemini.wrapper;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class WrapperDemo4 {

	public static void main(String[] args) {
		  String s1="100";
		  String s2="100";
		  
		   s1=s1+200; // no arithmetic operation
		              // string concatenation 
		   out.println(s1);
		   
		   int d1=parseInt(s2);
		   
		   d1=d1+200;
	
		   out.println(d1);
	   // parseXXX
		   // Integer.parseInt
		   //Float.parseFloat()
		   //Double.parseDouble()
	}
}
