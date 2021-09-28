package com.capgemini.gc;

import java.util.Date;
import java.util.Iterator;

public class GarbageCollectionPrg1 {

	public static void main(String[] args) {

		Date date[] = new Date[10000];
		Runtime runtime = Runtime.getRuntime();
		
        System.out.println("Free Memory "+runtime.freeMemory());
		
		for (int i = 0; i < date.length; i++) 
			date[i] = new Date();
	
        System.out.println("After Memory Allocation");
		System.out.println("Free Memory "+runtime.freeMemory());
	
		for (int i = 0; i < date.length; i++) 
			date[i] = null;

		System.gc();
		
		System.out.println("After Calling Garbage Collection");
		System.out.println("Free Memory "+runtime.freeMemory());
		
		
	}
}
