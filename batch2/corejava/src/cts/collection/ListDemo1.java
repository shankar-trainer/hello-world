package cts.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
	static class myclass {

	}

	public static void main(String[] args) {
		List list1 = new ArrayList();

		list1.add(1233);// autoboxing 
		list1.add(new Integer(4566));
		list1.add(6566565.55f);
		list1.add("hello");

		list1.add(new myclass());

		// add -- add element to the list 
		// get  -- get method access elements using index
		System.out.println(list1);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(3));
		
		
		
		
		
	}
}
