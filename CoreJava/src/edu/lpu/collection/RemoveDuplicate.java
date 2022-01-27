package edu.lpu.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String name[]= {"madhu","sarita","kavya","madhu","sri","puja","sarita"};
		Set<String> set1=new HashSet<>();
		for (String string :name) {
			set1.add(string);
		}
		
		System.out.println(set1);
	   Object[] array = set1.toArray();
		
	   System.out.println(Arrays.toString(array));
	}
}
