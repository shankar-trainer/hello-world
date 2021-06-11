package cts.com.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FilePrg2 {

	public static void main(String[] args) {

		Scanner scanner = null;
		FileOutputStream outputStream = null;

		try {
			scanner = new Scanner(System.in);
			outputStream = new FileOutputStream("C:\\welcome1\\test1.txt", true);

			outputStream.write("hello world".getBytes());
			String ch = "";

			while (!ch.equalsIgnoreCase("exit123")) {
				System.out.println("Enter String ");
				ch = scanner.nextLine();
				outputStream.write(("\n"+ch).getBytes());
				System.out.println("enter exit123 to stop\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				outputStream.close();
				scanner.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
