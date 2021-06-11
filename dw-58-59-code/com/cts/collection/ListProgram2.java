package com.cts.collection;

import java.util.List;
import java.util.ArrayList;

public class ListProgram2 {

	public static void main(String[] args) {
		List list1=new ArrayList();
		
		list1.add("hello");
		list1.add(765667);
		list1.add(new Integer(765667));
		
		list1.add(765667.677676f);
		
		System.out.println(list1);
		
		
	}
}
