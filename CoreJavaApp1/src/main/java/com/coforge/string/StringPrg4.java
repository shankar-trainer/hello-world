package com.coforge.string;

public class StringPrg4 {

	public static void main(String[] args) {

		String email = "emp_coforge_shyam@coforge.com";

		int pos = email.indexOf('@');
		if (pos >= 0)
			System.out.println("found at " + pos);
		else
			System.out.println("not found");

		if (email.indexOf('@') >= 0) {
			if (email.endsWith(".com")) {
				if (email.startsWith("emp_coforge")) {
					System.out.println("valid email");
				} else
					System.out.println("invalid email doenot starts  with emp_coforge ");
			} else
				System.out.println("invalid email doenot ends with .com ");
		} else
			System.out.println("invalid email does not contain @ sign ");
	}
}
