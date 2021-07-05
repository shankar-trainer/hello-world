package cts.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrg12 {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("c:/hello/test1.txt");
		int x;
		FileWriter fileWriter = new FileWriter("abc.txt");

		while ((x = fileReader.read()) != -1) {
			fileWriter.write(x);
		}
		fileReader.close();

		fileWriter.close();
	}
}
