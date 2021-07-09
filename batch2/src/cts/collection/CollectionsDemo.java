package cts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(11);
		list1.add(2);
		list1.add(4);
		list1.add(1);
		list1.add(17);
		
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
		int p=Collections.binarySearch(list1, 4);
		if(p>=0)
			System.out.println("found at "+p+"  position");
		else
			System.out.println("not found ");
		
		System.out.println(Collections.max(list1));
		System.out.println(Collections.min(list1));
		
		Collections.shuffle(list1);
		System.out.println(list1);
		
		
	}
}
