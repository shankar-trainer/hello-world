package com.capgemini.wrapper;

public class WrapperDemo1 {

	public static void main(String[] args) {
	
		int x=100;
		
		Integer i=new Integer(x);// boxing -- primitive to warpper 
		// cannot do arithmetic operation over object
		int intValue = i.intValue();//wrapper to primitive -- unboxing
		intValue++;
		intValue++;
		i=new Integer(intValue);// boxing
		System.out.println(i);
	}
	
}
