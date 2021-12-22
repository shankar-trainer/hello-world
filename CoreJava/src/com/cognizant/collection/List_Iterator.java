package com.cognizant.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {

		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("delhi");
		cityList.add("noida");
		cityList.add("delhi");
		cityList.add("chennai");
		cityList.add("gurgaon");
		cityList.add("kolkotta");
		cityList.add("chennai");
		Iterator<String> it = cityList.iterator();

		while (it.hasNext()) {
			 System.out.println(it.next());
		}
		
		System.out.println("List Iterator");
		
		ListIterator<String> it1 = cityList.listIterator();

		while (it1.hasNext()) {
			 System.out.print(it1.next()+"    ");
		}

		System.out.println("\nlist iterator in reverse order \n");
		
		while (it1.hasPrevious()) {
			 System.out.print(it1.previous()+"    ");
		}

	}
}
