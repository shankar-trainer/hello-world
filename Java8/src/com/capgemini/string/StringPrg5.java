package com.capgemini.string;

public class StringPrg5 {

	public static void main(String[] args) {

		String s1 = "hello world";
		String s2 = s1.toUpperCase();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s2.toLowerCase());

		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 8));

		String var = "ram goes to school";
		String[] split = var.split(" ");

		for (String s : split)
			System.out.println(s);

		var = "ram-goes-to-school.we-all-have-gone-to-school";
		System.out.println("---------");
		split = var.split("-");

		for (String s : split)
			System.out.print(s+" , ");

	}
}
