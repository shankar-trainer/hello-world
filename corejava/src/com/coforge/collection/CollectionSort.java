package com.coforge.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		
		String state[]= {"uttar pardesh","tamil nadu","bihar","punjab"};
	
		List<String> asList = Arrays.asList(state);
		
		List<String> stateList=new ArrayList<>();
		
		stateList.add("rajsthan");
		stateList.add("haryana");
		stateList.add(state[0]);
		stateList.add(state[1]);
		stateList.add(state[2]);
		stateList.add(state[3]);
		
		System.out.println(stateList);
		Collections.sort(stateList);
		System.out.println(stateList);
		
		System.out.println(Collections.binarySearch(stateList, "haryana"));
		System.out.println(Collections.max(stateList));
		System.out.println(Collections.min(stateList));
		Collections.shuffle(stateList);
		System.out.println(stateList);
	}
}
