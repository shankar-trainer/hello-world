package edu.lpu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.lpu.exception.Employee;

public class ArrayListExample1 {

	public static void main(String[] args) {
		//List list1=new ArrayList();
		ArrayList list1=new ArrayList();
		
		list1.add(877887);
		list1.add(new Integer(877887));
		list1.add("delhi");
		list1.add("java");
		list1.add(5454.45f);
		list1.add(new Employee());
		
		System.out.println(list1.contains("delhi"));
		
		list1.remove(5);// remove by index
		list1.remove("delhi");// remove by value
		System.out.println(list1.contains("delhi"));
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
	}
}
