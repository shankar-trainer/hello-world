package com.capgemini.format;

import java.io.*;

public class AssignmentDay6 {

	static class System {
		static PrintStream out = null;
		static {
			try {
				//out = new PrintStream(new FileOutputStream("abc.txt"));
				out = new PrintStream("abc.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		public void println(String s) {
			out.println(s);
		}
	}

	public static void main(String[] args) {
		System.out.println("hello ");
		System.out.println("hello ");
		System.out.println("hello ");
	}

}
