package edu.coforge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample1 {

	public static void main(String[] args) {
		
		Collection list1=new ArrayList();
		
		// Collection is super interface, no get method 
		
		list1.add(43443);
		list1.add(new Integer(4545));
		list1.add("delhi");
		list1.add(new EmployeeTest());
		
		System.out.println(list1);
		System.out.println(list1);
		
		List  list2=new ArrayList<>();
		list2.add("java");
		list2.add(545454);
		list2.add(new Float(56f));
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		
		System.out.println(list2);
		
	}
}
