package cts.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo5 {

	public static void main(String[] args) {
		
		List<String> language1 = new ArrayList<>();

		language1.add("java");
		language1.add("php");
		language1.add("python");
		language1.add("jython");

		ListIterator<String> listIterator = language1.listIterator();
		
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		
		System.out.println("reverse direction");
		
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
		System.out.println(listIterator.previous());
	}
}
