package com.capgemini.format;

import java.text.DecimalFormat;

public class FormatExample3 {

	public static void main(String[] args) {
		
		float salary=20000.567f;
		DecimalFormat decimalFormat=new DecimalFormat("00,00,000.00");
		System.out.println(decimalFormat.format(salary));
		
		DecimalFormat decimalFormat1=new DecimalFormat("##,##,###.00");
		
		System.out.println(decimalFormat1.format(salary));
		System.out.println(decimalFormat1.format(123456.0000000));
		System.out.println(decimalFormat1.format(123456.123456));
		
	}
}
