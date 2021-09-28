package com.capgemini.gc;

class Customer {
	int id;
	String name;
	float salary;
	
	/*
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called .. ");
	}
	*/
}

public class GarbageCollectionPrg2 {

	public static void main(String[] args) {

		Customer customer[] = new Customer[100000];

		 Runtime runtime = Runtime.getRuntime();
		 System.out.println("Free Memory "+runtime.freeMemory());

		for (int i = 0; i < customer.length; i++) 
	     customer[i]=new Customer();		
   		
		 System.out.println("Free Memory "+runtime.freeMemory());

		for (int i = 0; i < customer.length; i++) 
			customer[i]=null;		
		
		System.gc();
		 System.out.println("Free Memory "+runtime.freeMemory());

	}
}
