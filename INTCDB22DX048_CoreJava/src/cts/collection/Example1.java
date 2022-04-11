package cts.collection;

import java.util.ArrayList;
import java.util.List;
class Employee{
	int id;
	String name;
}
public class Example1 {

	public static void main(String[] args) {
		List list1=new ArrayList();
		
		list1.add(new Integer(1111));
		list1.add("hello world");
		list1.add(767676);
		list1.add("hello world");
		list1.add(7887887.767676);
		list1.add(new Employee());
		list1.add("hello world");
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.size());
		list1.remove(0);
		list1.remove("hello world");
		System.out.println(list1.size());
		System.out.println(list1);
	}
}
