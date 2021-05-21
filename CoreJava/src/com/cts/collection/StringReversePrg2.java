package com.cts.collection;

import java.util.Arrays;
import java.util.Comparator;

import com.cts.inner.Myclass;

public class StringReversePrg2 {

	Comparator<String> comparator=new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o2.compareTo(o1);
		}
	};
	
	
	public static void main(String[] args) {
	
		String ar[]= {"mohan","ajay","vijay","rahul"};
		Arrays.sort(ar,new  StringReversePrg2().comparator);
		System.out.println(Arrays.toString(ar));

		Comparator<String> comparator=(String o1, String o2)->o2.compareTo(o1);
		
		Arrays.sort(ar,comparator);
		System.out.println(Arrays.toString(ar));
	}
}
