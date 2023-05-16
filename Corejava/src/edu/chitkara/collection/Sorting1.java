package edu.chitkara.collection;

import java.util.Set;
import java.util.TreeSet;

public class Sorting1 {

	static void display(String arrray[]) {
		for (String string : arrray) {
			System.out.print(string + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String ar[] = { "delhi", "chennai", "madurai", "kolkotta", "mumbai", "chandigarh" };
        System.out.println("unsorted array \n"); 
		display(ar);
		
		Set<String> set1=new TreeSet<String>();
		
		for (String string : ar) {
		  set1.add(string);	
		}
		
		System.out.println("sorted array \n");
		System.out.println(set1);
		
	}
}
