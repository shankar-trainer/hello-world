package com.capgemini.java8;

public class lambdaEx3 {

	interface Entertainment{
	      String fun();	
		}
	
	interface Display{
		int nameLength(String s);	
	}
	

	public static void main(String[] args) {
     
		Entertainment ent=()->"have a fun";
        Display disp=(p)-> p.length();		
        
        System.out.println(ent.fun());
        System.out.println(disp.nameLength("rameshwar paratap choudhary"));
		
	}
}
