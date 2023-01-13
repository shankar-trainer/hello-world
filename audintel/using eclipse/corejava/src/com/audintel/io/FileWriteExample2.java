package com.audintel.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample2 {

	static void writeToTheFile(String s[]) throws IOException {
		FileWriter fileWriter = new FileWriter("/welcome/abc.txt", true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		for (String p : s) {
			p = p.concat("\n");
			bufferedWriter.write(p);
		}
		bufferedWriter.close();
	}

	static void readTheFile() throws IOException {
		// FileReader fileReader=new FileReader("/welcome/abc.txt");
		// BufferedReader reader=new BufferedReader(fileReader);
  System.out.println("reading in 1st way\n");
		BufferedReader reader = new BufferedReader(new FileReader("/welcome/abc.txt"));

		char ar[] = new char[200];
		reader.read(ar);
		System.out.println(ar);
		reader.close();
//----------------------------------
		BufferedReader reader1 = new BufferedReader(new FileReader("/welcome/abc.txt"));
		
		System.out.println("reading in 2nd way\n");
		String s;
		while ((s = reader1.readLine()) != null)
			System.out.println(s);

		reader1.close();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = "";
		String ar[] = new String[100];
		int x = 0;
		while (!p.equals("@exit")) {
			ar[x++] = p;
			System.out.println("Enter line and to exit type @exit");
			p = sc.nextLine();
		}
		String ar1[] = new String[x];
		for (int i = 0; i < x; i++) {
			ar1[i] = ar[i];
		}

		try {
			writeToTheFile(ar1);
			readTheFile();
		} catch (IOException e) {
			System.err.println(e);
		}
		sc.close();
	}
}
