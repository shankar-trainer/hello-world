package edu.lpu.collection;

import java.util.Arrays;

public class GenericMethod {

	static <E> void  display(E e[]) {
		for (E e2 : e) {
			System.out.print(e2+", ");
		}
		System.out.println("\n");
	}

	static <E> void  sort_display(E e[]) {
		Arrays.sort(e);
		System.out.println("sorted ");
		for (E e2 : e) {
			System.out.print(e2+", ");
		}
		System.out.println("\n");
	}
	
	
	
	public static void main(String[] args) {
		
		Integer ar[]= {5,4,5,6,2,1,3};
		String name[]= {"abdhh kishor","aaftab", "sahil","suresh bhardwaj","kamal kapoor"};
		Float salary[]= {12000.0f,45000.0f,78000.0f,56000.0f,34000.0f};
		
		display(ar);
		sort_display(ar);
		
		display(name);
		sort_display(name);
		display(salary);
		sort_display(salary);
	}
}
