package com.coforge.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListSort {

	public static void main(String[] args) {
		Integer ar[]= {11,2,3,1,5,6,4};
		List<Integer> asList = Arrays.asList(ar);

		List<Integer> list1=new ArrayList<>(asList);
				
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
		System.out.println("found at "+Collections.binarySearch(list1, 5));
		
		
	}
}
