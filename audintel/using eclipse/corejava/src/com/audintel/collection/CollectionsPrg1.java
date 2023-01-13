package com.audintel.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsPrg1 {

	public static void main(String[] args) {
		ArrayList<String> courseList = new ArrayList<>();

		courseList.add("bca");
		courseList.add("mca");
		courseList.add("m.tech");
		courseList.add("b.tech");
		courseList.add("bba");
		courseList.add("mba");
		courseList.add("be");
		courseList.add("b.ed");
		courseList.add("m.ed");

		System.out.println(courseList);
		Collections.reverse(courseList);
		System.out.println("after reverse " + courseList);

		Collections.sort(courseList);
		System.out.println("after sorting " + courseList);

		System.out.println("first element is " + Collections.min(courseList));
		System.out.println("last element is " + Collections.max(courseList));

		System.out.println(Collections.binarySearch(courseList, "mba") >= 0 ? "found  " : "not found");

		Collections.shuffle(courseList);
		System.out.println("after shuffle  " + courseList);
		
	}
}
