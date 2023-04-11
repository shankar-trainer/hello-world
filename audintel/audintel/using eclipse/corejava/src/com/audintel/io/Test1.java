package com.audintel.io;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter empId");
		int id=scanner.nextInt();
		
		System.out.println("Enter empName");
		String nm=scanner.nextLine();
		
		
		System.out.println("Id is  "+id);
		System.out.println("name is  "+nm);
		
		
		
	}
}
