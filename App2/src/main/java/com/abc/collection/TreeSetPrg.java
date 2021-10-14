package com.abc.collection;

import java.util.HashSet;
import java.util.Set;

public class TreeSetPrg {

	public static void main(String[] args) {
		Set<String> departmentset=new HashSet<>();
				//TreeSet<>();
		departmentset.add("training");
		departmentset.add("development");
		departmentset.add("delievery");
		departmentset.add("transport");
		departmentset.add("training");
		
		System.out.println(departmentset);
		
	}
}
