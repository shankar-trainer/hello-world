package com.capgemini.sys;

public class SysDemo {

	public static void main(String[] args) {
		
		//System.in
		//System.out
		//System.err
		
	System.out.println(System.currentTimeMillis());
	long currentTimeMillis = System.currentTimeMillis();
	
	for (int i = 0; i <=12000; i++) {
	System.out.println(i);	
	}
	
	long currentTimeMillis1 = System.currentTimeMillis();
	
	
	System.out.println("no of milli sec elapsed for program execution");
	System.out.println(currentTimeMillis1-currentTimeMillis);
	System.out.println("\nno of  sec elapsed for program execution");
	System.out.println((currentTimeMillis1-currentTimeMillis)/1000);
	
	}
}
