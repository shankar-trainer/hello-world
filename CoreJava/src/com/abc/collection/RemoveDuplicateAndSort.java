package com.abc.collection;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateAndSort {

	public static void main(String[] args) {
		String ar[] = { "hello", "welcome", "greeting", "good morning", "all well", "welcome", "greeting",
				"have a nice day"};

			Set<String> set1=new TreeSet<>(); 
					//HashSet<>();
            for (String string : ar) {
				set1.add(string);
			}		
            System.out.println(set1);
	}
}
