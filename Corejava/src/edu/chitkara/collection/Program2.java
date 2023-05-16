package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		List<String> list1=new ArrayList<>();
		int n=scanner.nextInt();
		
		for (int i = 1; i <=n; i++) {
			list1.add(scanner.nextLine());
		}
		
		System.out.println(list1);
		
		Set<String> set1=new TreeSet<String>(list1);
		
		System.out.println(set1);
		
		
		
		
		
		
	}
}
