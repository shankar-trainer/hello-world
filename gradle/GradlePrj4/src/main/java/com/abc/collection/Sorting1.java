package com.abc.collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Sorting1 {

	public static void main(String[] args) {
		
      String ar[]= {"delhi","noida","madurai","kanchipuram"};
		
		TreeSet<String> set1=new TreeSet<String>();
        for (String string : ar) {
			set1.add(string);
		}
		
        System.out.println(set1);
		
        
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
	}
}
