package com.montran.collection;

import java.util.ArrayList;
import java.util.List;
class Hello{
	
}
public class ArrayListExample {
	
public static void main(String[] args) {
	
	List list1=new ArrayList();
	
	list1.add("hello");
	list1.add(new Integer(6775767));
	list1.add(76777.67f);// autoboxing 
	list1.add(76776);
	list1.add(new Hello());
	
	System.out.println(list1);
	
	System.out.println(list1.get(0));
	System.out.println(list1.get(1));
	list1.remove(3);
	list1.remove("hello");
	
	System.out.println(list1);
}
}
