package edu.lpu.collection;

import java.util.ArrayList;
import java.util.Random;

public class ListTraversing {

	public static void main(String[] args) {
		ArrayList<Integer> empCode=new ArrayList<>();
		Random random=new Random();
		
		empCode.add(random.nextInt());
		empCode.add(random.nextInt());
		empCode.add(random.nextInt());
		empCode.add(random.nextInt());

		System.out.println(empCode.get(0));
		System.out.println(empCode.get(1));
		System.out.println(empCode.get(2));
		
		System.out.println("\nall employee code using for loop");
		
		for (int i = 0; i < empCode.size(); i++) {
			System.out.println(empCode.get(i));
		}
		
		System.out.println("\nall employee code using for each  loop\n");
		
		for (int i:empCode) {
			System.out.println(i);
		}
	}
}
