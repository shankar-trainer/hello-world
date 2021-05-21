package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

class StringReverse implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
public class ReverseStringArray extends ReverseSuper implements StrInterface {

	public static void main(String[] args) {
		
		String food[]= {"pizza","dosa","idli","fried rice","momos"};
		System.out.println(Arrays.toString(food));

		Arrays.sort(food);
		
		System.out.println(Arrays.toString(food));
		
		Arrays.sort(food,new StringReverse());
		
		System.out.println(Arrays.toString(food));
		
	}
}
