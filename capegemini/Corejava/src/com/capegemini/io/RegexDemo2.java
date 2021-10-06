package com.capegemini.io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("[0-9]{2}");
				//("[a-z]{2}");
				//("[a-z]+");
				//("[a-z]");
		String s="Roll no is 1. Marks is a 45";
		
		Matcher matcher=pattern.matcher(s);

		while(matcher.find())
		System.out.println(matcher.group());
		
		
	}
}
