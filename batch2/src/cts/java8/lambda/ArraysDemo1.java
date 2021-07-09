package cts.java8.lambda;

import java.util.Arrays;

public class ArraysDemo1 {

	public static void main(String[] args) {
		int ar[]= {11,2,3,1,4,9};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		
		
		Employee employee[]=new Employee[3];
		employee[0]=new Employee(788787, "keshav prasad", 12000);
		employee[1]=new Employee(788781, "sambhu prasad", 11000);
		employee[2]=new Employee(788790, "mahadev prasad", 18000);
		
		Arrays.sort(employee);
		for (Employee employee2 : employee) {
			System.out.println(employee2);
		}
	}
}
