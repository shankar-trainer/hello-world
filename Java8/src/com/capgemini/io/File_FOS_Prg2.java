package com.capgemini.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File_FOS_Prg2 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		Scanner sc = null;
		String s = null;
		int x;

		try {
			fos = new FileOutputStream("c:\\welcome1\\test2.txt", true);
			sc = new Scanner(System.in);
			s = "";
			System.out.println("Enter exit123 to exit from user input");
			while (!s.equals("exit123")) {
				System.out.println("Enter text ");
				s = sc.nextLine();
				fos.write(s.concat("\n").getBytes());
			}
			fis = new FileInputStream("c:\\welcome1\\test2.txt");
			while ((x = fis.read()) != -1)
				System.out.print((char) x);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				sc.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
