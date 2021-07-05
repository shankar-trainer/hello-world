package cts.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilePrg6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileOutputStream stream;
		try {
			stream = new FileOutputStream("c:\\hello\\test3.txt");

			String s = " ";
			System.out.println("enter exit1 to exit");
			while (!s.equals("exit1")) {
				System.out.println("Enter line ");
				s = scanner.nextLine();
				try {
					stream.write(s.concat("\n").getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

	}
}
