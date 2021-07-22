package com.montran.error;

public class Test1 {

	public static void main(String[] args) {
		Integer x = 100;
		int y = x;

		Integer s = null;// autoboxing

		int r = 0;
		System.out.println(r);
		// r=s;// null pointer exception
		System.out.println(r);

		System.out.println("program start ");
		try {
			int j = 10;
			System.out.println(j / 0);
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			System.err.println(e.getMessage());

		}
		System.out.println("program ends ");

	}
}
