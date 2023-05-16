package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class LustIteratorExample {

	public static void main(String[] args) {
		
		int ar[]= {11,22,33,44,55};
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		for(int a:ar)
			  list1.add(a);
		
		ListIterator<Integer> listIterator=list1.listIterator();
            while(listIterator.hasNext())
            	System.out.print(listIterator.next()+",");
            
            System.out.println("\n reverse direction ");
            
            while(listIterator.hasPrevious())
            	System.out.print(listIterator.previous()+",");
            	
            
		
	}
}
