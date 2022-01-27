package edu.lpu.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import edu.lpu.exception.Employee;

public class ListDemo1 {

	public static void main(String[] args) {
		//List list1=new ArrayList();
		//Collection list1=new ArrayList();
		ArrayList list1=new ArrayList();
		
		list1.add(new Integer(1000));
		
		list1.add(9009);
		list1.add("delhi");
		list1.add("mohan kumar");
		list1.add(787878.67f);
		list1.add('a');
		list1.add(9009);
		list1.add("delhi");
		list1.add(new  Employee());
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		
		list1.remove(0);
		System.out.println(list1);
		
		System.out.println(list1.contains("delhi"));
		
		Collections.sort(list1);
	}
}
