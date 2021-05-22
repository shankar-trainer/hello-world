package com.cts;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		try {
		User user=new User();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id ");
		
		user.setUserId(scanner.nextInt());
		
		System.out.println("Enter Name ");
		
		scanner.nextLine();// trap the enter key 
		
		user.setUserName(scanner.nextLine());
		
		System.out.println("Enter Location ");
		user.setUserLocation(scanner.next());
		
		System.out.println("Enter Salary ");
		user.setUserSalary(scanner.nextFloat());
		
		System.out.println("User Informationn ");
		System.out.println("User Id "+user.getUserId());
		System.out.println("User Name "+user.getUserName());
		System.out.println("User Location "+user.getUserLocation());
		System.out.println("User Salary "+user.getUserSalary());
		
		}
		catch (UserException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
