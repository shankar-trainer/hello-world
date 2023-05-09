package com.nec.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.nec.io.Student;

public class ArrayListPrg1 {

	
	public static void main(String[] args) {
		
		
		List list1=new ArrayList();
		
		list1.add(78678687);
		list1.add("mumbai");
		list1.add(new Student());
		list1.add(new Integer(545454));
		list1.add(new Float(545.567f));
		
		System.out.println(list1);
		//Collections.sort(list1);
		
	}
}
