package com.nec.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreamPrg2 {

	public static void main(String[] args) throws IOException {

		// FileReader reader = new FileReader("hello.c");

//		  BufferedReader bufferedReader=new BufferedReader(reader);
		BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.c"));

		System.out.println(bufferedReader.readLine());
		
		String s;
		
		while((s=bufferedReader.readLine())!=null) {
			System.out.println(s);
		}

	}
}
