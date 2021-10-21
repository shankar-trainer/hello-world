package com.capegemini.java8;

public class Bank {

	private int regno;
	private String name;
	private float amt;

	float interest() {
		return amt * BankOperation.rate;
	}

	public Bank() {
	}

	public Bank(int regno, String name, float amt) {
		super();
		this.regno = regno;
		this.name = name;
		this.amt = amt;
	}

	private static class BankOperation {
		static float rate = 0.05f;
		static String country = "India";
		static String state = "UP";

		static void bankInfo() {
			System.out.println("Country name is " + country);
			System.out.println("State name is " + state);
			System.out.println("Interest Rate  is " + rate);
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank(444555, "abc bank", 4567778.56f);
		System.out.println("Interest is  " + bank.interest());
		BankOperation.bankInfo();
	}
}
