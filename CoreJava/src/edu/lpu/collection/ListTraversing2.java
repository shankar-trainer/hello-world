package edu.lpu.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTraversing2 {

	public static void main(String[] args) {
		ArrayList<String> citylist=new ArrayList<>();
		
		citylist.add("delhi");
		citylist.add("bombay");
		citylist.add("ahmadabad");
		citylist.add("chennai");
		citylist.add("ooty");
		
		Iterator<String> iterator1 = citylist.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		    iterator1.remove();   
		}
		System.out.println(citylist);
		
	}
}
