package com.audintel.collection;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class VectorExample {

	 public static void main(String[] args) {
		
		 Vector<Integer>  empIdVector=new Vector<>();
		 
		 System.out.println("Capacity "+empIdVector.capacity()+" size "+empIdVector.size());
		 
		 for (int i = 0; i <=9; i++) {
			 empIdVector.add(new Random().nextInt());
		}
		 System.out.println("Capacity "+empIdVector.capacity()+" size "+empIdVector.size());
		 
		 empIdVector.add(new Random().nextInt());
		 System.out.println("Capacity "+empIdVector.capacity()+" size "+empIdVector.size());
          
		 Iterator<Integer> iterator = empIdVector.iterator();
		 System.out.println(empIdVector);
		 System.out.println(empIdVector.get(0));
		 
		 System.out.println("traversing using iterator ");
		 
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
			 iterator.remove();
		 }
		 System.out.println("after traversing  ");
		 System.out.println(empIdVector);
			 
		 
	}
	
}
