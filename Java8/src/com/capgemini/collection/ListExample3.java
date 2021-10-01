package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample3 {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(6);
		list1.add(7);
		list1.add(9);
		
		System.out.println("using for loop \n");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("using for each \n");
		for (Integer integer : list1) {
			System.out.println(integer);
		}
				
		Iterator<Integer> it=list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
      System.out.println(list1);
	}
}
