package com.capgemini.error;

public class CastProgram2 {

	public static void main(String[] args) {
		//reference program
		//reference variable casting must follwo the inheritance 
		
	//	Integer k=null;
		Integer k=12345;
		
		Float f1=767676.67f;
		
		//f1=k;  // error
		//k=f1;  // error 
		
		// assign sub class reference to super class variable 
		
		//Float is a number 
		//Integer is a number
		Number n=f1;
		n=k;
		
		// cannot assign super class reference to sub class variable 
		// if  casted it, run time error java.lang.ClassCastException  
        
		// Number is a Float
		// Number is a Integer
		
		f1=(Float) n;
		
		//java.lang.ClassCastException
	}
}
