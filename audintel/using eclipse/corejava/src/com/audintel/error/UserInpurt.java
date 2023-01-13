package com.audintel.error;

import java.util.Scanner;

public class UserInpurt {

	public static void main(String[] args) {
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Id and name");
			id = sc.nextInt();

			sc.nextLine();
			name = sc.nextLine();
			System.out.println("id is " + id);
			System.out.println("name is " + name);
		} catch (Exception e) {
		} finally {
			sc.close();
			System.out.println("finally runs ");
		}
	}
}
