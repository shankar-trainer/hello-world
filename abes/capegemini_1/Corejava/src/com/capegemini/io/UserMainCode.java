package com.capegemini.io;

public class UserMainCode {

	static int validateNumber(String s ) {
		if(s.matches("\\d{3}-\\d{3}-\\d{4}")) 
			return 1;
		else
		return -1;		
	}
}

