package com.audintel.collection;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Employee;

public class ListPrg1 {

	public static void main(String[] args) {
		// Collection c= new ArrayList();
		List c = new ArrayList();
		c.add("hello");
		c.add(new Integer(7676767));
		c.add(new Employee());
		c.add(676677.787878f);

		System.out.println(c);
		System.out.println(c.get(2));

		for (int i = 0; i < c.size(); i++) 
			System.out.print(c.get(i) + ", ");
		
		c.remove(2);// using index
		c.remove("hello");//using object
		
		System.out.println("\nusing for each ");

		for (Object object : c) 
			System.out.println(object);
		
	}
}
