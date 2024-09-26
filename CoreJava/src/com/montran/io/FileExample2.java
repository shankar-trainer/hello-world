package com.montran.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileExample2 {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream = null;
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			fileOutputStream = new FileOutputStream("test1.txt", true);
					//("C:/welcome/test1.txt", true);
			String s = "";
			System.out.println("type exit123 to exit ");

			while (!s.equals("exit123")) {
				System.out.println("Enter lines ");
				s = scanner.nextLine();
				fileOutputStream.write(s.concat("\n").getBytes());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileOutputStream.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
