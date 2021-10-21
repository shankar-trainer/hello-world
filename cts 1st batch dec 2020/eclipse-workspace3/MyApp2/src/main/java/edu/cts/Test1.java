package edu.cts;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		

		Stream.of(11,22,33).forEach(a->System.out.print(a+"  "));
		
		System.out.println(" ");
		
		List<Integer> collect = Stream.of(11,22,33,44,55,66,77,88).filter(a->a%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		
	}
}
