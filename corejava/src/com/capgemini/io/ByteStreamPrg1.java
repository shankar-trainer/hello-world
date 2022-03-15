package com.capgemini.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamPrg1 {

	public static void main(String[] args) throws IOException {

		FileOutputStream outputStream = null;// write to the file using bytes
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);

			outputStream = new FileOutputStream("c:/window/abc.txt");// unix style path 
					//("c:\\welcome\\abc.txt");\\ window style path
			outputStream.write("\nhello world".getBytes());
			outputStream.write("\nhello world".getBytes());
			outputStream.write("\nhello world".getBytes());
			outputStream.write("\nhello world".getBytes());

			for (int x = 0; x <= 4; x++) {
				System.out.println("Enter line ");
				outputStream.write(("\n" + sc.nextLine()).getBytes());
			}
			
		} catch (IOException e) {
			System.err.println(e);
		}

		finally {
			outputStream.close();
			sc.close();
		}

	}

}
