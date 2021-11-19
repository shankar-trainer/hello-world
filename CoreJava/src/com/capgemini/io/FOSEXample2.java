package com.capgemini.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FOSEXample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String check = "y";
		String line = "y";

		FileOutputStream stream = null;
		int x=0;
		try {
			//stream = new FileOutputStream("C:\\welcome\\test2.txt", true);
			stream = new FileOutputStream("test2.txt", true);
			do {
				System.out.println("Enter line ");

				if(x++>0)
				scanner.nextLine();
				
				line = scanner.nextLine();
				stream.write("\n".concat(line).getBytes());
				System.out.println("Enter y\\n to continue");
				check = scanner.next();

			} while (check.equals("y"));

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				stream.close();
				scanner.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
