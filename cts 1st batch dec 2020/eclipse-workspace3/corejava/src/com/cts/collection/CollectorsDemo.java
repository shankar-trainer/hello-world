package com.cts.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {

		List<Float> salaryList = new ArrayList<Float>();

		salaryList.add(43324.0f);
		salaryList.add(40324.0f);
		salaryList.add(41324.0f);
		salaryList.add(53324.0f);
		salaryList.add(33324.0f);
		salaryList.add(23324.0f);

		salaryList.stream().forEach(a -> System.out.println(a));

		System.out.println("using filter ");

		salaryList.stream().filter(a -> a > 40000).forEach(a -> System.out.println(a));

List<Float> salary1list = salaryList.stream().filter(a -> a > 40000).collect(Collectors.toList());


System.out.println("using limit ");

salaryList.stream().limit(3).forEach(a -> System.out.println(a));

System.out.println("using skip ");

salaryList.stream().skip(3).forEach(a -> System.out.println(a));

		
	}
}
