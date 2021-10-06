package com.capegemini.io;

import java.io.*;

public class CSVRead {

	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream("student.csv");
		int x = stream.read();
		char c[] = new char[200];
		int i = 0;
		while (x != -1) {
			c[i++] = (char) x;
			x = stream.read();
		}
		String s1 = new String(c);
		String s2=s1.trim();
	
	String ar1[]=	s2.split("\n");
	
	for (String string : ar1) {
		String ar2[]=string.split(",");
		for (String string2 : ar2) {
			System.out.print(string2+"  ");
		}
		System.out.println();
	}
	
	
	}
}
