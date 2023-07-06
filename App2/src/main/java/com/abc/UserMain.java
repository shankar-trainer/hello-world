package com.abc;

import com.coforge.User;

public class UserMain {

	public static void main(String[] args) {
		User user=new User(10001, "amit saxsena", 34000);
		System.out.println("user data");
		System.out.println("\tid "+user.getUserId());
		System.out.println("\tname "+user.getUserName());
		System.out.println("\tsalary "+user.getUserSalary());
	}
	
}
