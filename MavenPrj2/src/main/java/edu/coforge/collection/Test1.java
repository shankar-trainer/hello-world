package edu.coforge.collection;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<>();
		
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1004);
		
		list1.remove(new Integer(1001));
		System.out.println(list1);
		
		
	}
}
