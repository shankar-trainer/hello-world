package com.audintel.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteExample {

	static void writeToTheFile(String s[]) throws IOException {
		FileWriter fileWriter = new FileWriter("/welcome/abc.txt", true);
		for (String p : s) {
			p = p.concat("\n");
			fileWriter.write(p);
		}
		fileWriter.close();
	}
	static void readTheFile() throws IOException {
		FileReader fileReader=new FileReader("/welcome/abc.txt");
		char ar[]=new char[200];
		
		fileReader.read(ar);
		System.out.println(ar);
         fileReader.close();		
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
