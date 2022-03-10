package com.capgemini.exception;

import java.util.Scanner;

public class UserException {
	private int id;
	private String name;
	private float salary;

	Scanner sc;

	public UserException() {
		sc = new Scanner(System.in);
	}

	public void input() throws Exception {
		System.out.println("Enter id ");
		id = sc.nextInt();
		if(id<=0)
			throw new Exception("invalid id ");

		System.out.println("Enter name ");
		sc.nextLine();
		name = sc.nextLine();// nextLine()
		if(name.isEmpty())
			throw new Exception("invalid name ");

		System.out.println("Enter salary ");
		salary = sc.nextFloat();
		if(salary<=0)
			throw new Exception("invalid salary ");

	}

	@Override
	public String toString() {
		return "\nUser Data \n \tid=" + id + "\n\tname=" + name + "\n\tsalary=" + salary ;
	}
	
	public static void main(String[] args) {
	   UserException exception=new UserException();
       try {
		exception.input();
		System.out.println(exception);
	} catch (Exception e) {
    System.err.println(e.getMessage());
	}
	}

}
