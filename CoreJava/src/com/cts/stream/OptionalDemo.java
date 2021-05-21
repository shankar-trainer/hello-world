package com.cts.stream;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		// String s = null;
		String s = "java is interesting";

		Optional<String> s_is_null = Optional.ofNullable(s);
		if (s_is_null.isPresent())
			System.out.println(s.length());
		else
			System.out.println("it is null");

		String res1 = s_is_null.orElse(" is null  ");

		System.out.println(res1);

	}
}
