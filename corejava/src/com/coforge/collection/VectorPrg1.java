package com.coforge.collection;

import java.util.ListIterator;
import java.util.Vector;

public class VectorPrg1 {

	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<>();

		System.out.println("initial vector size " + vector1.size()); // 0
		System.out.println("initial vector1 capacity " + vector1.capacity());// 10

		for (int i = 100; i < 110; i++) {
			vector1.add(i + 20);
		}

		vector1.add(200 + 20);

		System.out.println(" vector size " + vector1.size()); // 10
		System.out.println(" vector1 capacity " + vector1.capacity());// 10

		ListIterator<Integer> listIterator = vector1.listIterator();

		while (listIterator.hasNext())
			System.out.print(listIterator.next() + ", ");

		System.out.println("\n reverse direction ");
		
		while (listIterator.hasPrevious())
			System.out.print(listIterator.previous()+",");
	}
}
