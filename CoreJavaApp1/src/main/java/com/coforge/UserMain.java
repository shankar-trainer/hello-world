package com.coforge;

public class UserMain {

	public static void main(String[] args) {
		User user=new User(10001,"sunil kumar", 12000);
		System.out.println("User Information ");
		System.out.println("\tId "+user.getUserId());
		System.out.println("\tName "+user.getUserName());
		System.out.println("\tSalary "+user.getUserSalary());
	}
}
