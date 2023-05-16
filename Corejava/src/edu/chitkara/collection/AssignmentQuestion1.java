package edu.chitkara.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentQuestion1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of student");
		int n = scanner.nextInt();

		ArrayList<String> studentList = new ArrayList<String>();
		System.out.println("Enter stuents name");

		for (int i = 1; i <= n; i++) 
			studentList.add(scanner.next());
		
		System.out.println("Enter name to search");
		String search = scanner.next();
		
		if(studentList.contains(search))
			System.out.println("present");
		else 
			System.out.println("not present");

	}
}
