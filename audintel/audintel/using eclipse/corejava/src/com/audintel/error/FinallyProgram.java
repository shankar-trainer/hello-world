package com.audintel.error;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyProgram {

	
	public static void main(String[] args) {
		System.out.println("Program starts ");
	
		FileReader reader = null;
		char ar[]=new char[200];
		try {
			reader = new FileReader("\\welcome\\abc11.txt");
		     reader.read(ar);
		     System.out.println(ar);
		} catch (FileNotFoundException e) {
			//System.err.println(e);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e);
		}
		
		finally {
			try {
				reader.close();
				System.out.println("finally runs");
			} catch (IOException e) {
				System.err.println(e);
			}
			System.out.println("file closed ");
		}
		System.out.println("Program ends ");
		
	}
}
