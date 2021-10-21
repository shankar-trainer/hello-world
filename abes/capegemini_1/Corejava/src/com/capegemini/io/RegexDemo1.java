package com.capegemini.io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		Pattern pattern=Pattern.compile("java");
		String s="java is programming language. java is used wolrd wide";
		
		Matcher matcher=pattern.matcher(s);
		
		System.out.println(matcher.find()+"  "+matcher.start()+"  "+matcher.group());
		System.out.println(matcher.find()+"  "+matcher.start()+"  "+matcher.group());
		
		
	}
}
