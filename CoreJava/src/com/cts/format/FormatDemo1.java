package com.cts.format;

import java.text.DecimalFormat;

public class FormatDemo1 {

	public static void main(String[] args) {

		float salary = 2000078.666f;
		String name = "ram kumar";
		String loc = "delhi";

		System.out.println("\nsalary " + salary + "\n name " + name + "\nlocation " + loc);

		System.out.printf("\n\nsalary %f \nName %s \nLocation %s", salary, name, loc);

		System.out.printf("\n%.2f", salary);
		System.out.printf("\n%5.2f", salary);
		System.out.printf("\n%20.2f", salary);

		System.out.format("\n%20.2f", salary);

		DecimalFormat decimalFormat = new DecimalFormat("##,###,##.00");
		String s1 = decimalFormat.format(salary);
		System.out.println();
		System.out.println(s1);
		
		

	}
}
