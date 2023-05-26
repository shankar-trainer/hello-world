package edu.chitkara.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritePrg2 {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("abc.txt",true);

		String ch = "y";
		Scanner sc = new Scanner(System.in);

		while (ch.equals("y")) {
			System.out.println("Enter line");
			sc.nextLine();
			writer.write(sc.nextLine().concat("\n"));

			System.out.println("continue y\\n");
			ch = sc.next();
		}
		writer.close();
	}
}
