package edu.coforge.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.coforge.EmployeeTest;

public class ListExample1 {

	public static void main(String[] args) {
			Collection list1=new ArrayList();
		// Collection is super interface, no get method 
		
		list1.add(43443);
		list1.add(new Integer(4545));
		list1.add("delhi");
		list1.add(new EmployeeTest());
		
		System.out.println(list1);
		list1.remove("delhi");
		
		for (Object object : list1) 
			System.out.println(object);
		
		List  list2=new ArrayList<>();
		//List supports index, get(index), remove(index)
		list2.add("java");
		list2.add(545454);
		list2.add(new Float(56f));
		
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		System.out.println(list2.get(2));
		
		list2.remove(1);
		list2.remove("java");
				
		System.out.println(list2);
	}
}
