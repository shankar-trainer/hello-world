package com.packt.bestpractices.indirecttesting;

public class StringUtil {

	public String format(String input) {
		if(input != null) {
			return input.replace("\n", "\t").trim().toLowerCase();
		}
		
		return null;
	}
}
