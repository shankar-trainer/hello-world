package com.capgemini.format;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class AssignmentDay6 {
	static class System {
		static PrintStream out;

		static void println(String s) {
			try {
				FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
				fileOutputStream.write(s.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("hello");

	}
}
