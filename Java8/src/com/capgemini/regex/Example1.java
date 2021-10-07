package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("hello");

		Matcher matcher = pattern.matcher("hello world hello java");
		//System.out.println(matcher.matches());

		while (matcher.find()) {
			System.out.println(matcher.group()+"  "+matcher.start()+"  "+matcher.end() );
		}

	}
}
