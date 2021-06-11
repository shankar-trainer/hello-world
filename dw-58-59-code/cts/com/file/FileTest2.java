package cts.com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest2 {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("C:\\welcome1\\greeting.txt", true);
		Scanner scanner = new Scanner(System.in);

		String ch = "";
		System.out.println("type exit123 to exit");

		while (!ch.equals("exit123")) {
			System.out.println("enter string");
			ch = scanner.nextLine();
			fileWriter.write("\n" + ch);

		}
		fileWriter.close();
		scanner.close();
		System.out.println("added to file ");

		FileReader fileReader = new FileReader("C:\\welcome1\\greeting.txt");
		int c;

		while ((c = fileReader.read()) != -1) {
			System.out.print((char) c);
		}

		fileReader.close();
	}
}
