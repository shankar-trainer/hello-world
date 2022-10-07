package com.montran.collection;

public class Q2 {

	public static void main(String[] args) {
		String ar[];
		for (String s : args) {
			ar = s.split(" ");
			try {
				if (Integer.parseInt(ar[1]) == 8) {
					System.out.println(ar[0]);
				}
			} catch (NumberFormatException e) {
				System.out.println("number format error  "+e.getMessage());
			}
		}
	}
}
