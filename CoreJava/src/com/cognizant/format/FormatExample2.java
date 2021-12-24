package com.cognizant.format;

import java.text.DecimalFormat;

public class FormatExample2 {

	public static void main(String[] args) {
		float salary=56567575.677676f;
		// 0 -- means if digit present it will print digit if not present it will give 0 
		DecimalFormat decimalFormat=new DecimalFormat("00,000,000,000.00");
		
		System.out.println(decimalFormat.format(salary));
		
		// # -- means if digit present it will print digit if not present it will not give 
		DecimalFormat decimalFormat1=new DecimalFormat("##,###,###,###.00");
		
		System.out.println(decimalFormat1.format(salary));
		
		System.out.println(String.format("%f", salary));
		
		System.out.println(String.format("%f", salary));
		System.out.println(String.format("%.2f", salary));
		System.out.println(String.format("%20.2f", salary));
		
	}
}
