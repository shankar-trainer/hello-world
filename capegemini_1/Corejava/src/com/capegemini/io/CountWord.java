package com.capegemini.io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWord {

	public static void main(String[] args) {

		String var = "we are learning abjava.java is fun.java is best ";

	Pattern pattern=Pattern.compile("\\bjava\\b");
	
	Matcher matcher=pattern.matcher(var);
	int x=0;
	while(matcher.find())
		x++;
		 System.out.println(x);
	
	}
}
