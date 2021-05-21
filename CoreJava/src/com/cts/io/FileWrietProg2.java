package com.cts.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrietProg2 {

	public static void main(String[] args) {
		FileOutputStream outputStream = null;
		BufferedOutputStream stream=null;
		Scanner scanner = new Scanner(System.in);
		String var = "";

		try {
			outputStream = new FileOutputStream("C:\\hello\\test2.txt", true);
			stream=new BufferedOutputStream(outputStream);
					
			while (!var.equals("quit4004")) {
				System.out.println("Enter text ");
				var = scanner.nextLine();
     			stream.write("\n".concat(var).getBytes());
				System.out.println("enter quit4004 to exit");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				stream.close();
				scanner.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
