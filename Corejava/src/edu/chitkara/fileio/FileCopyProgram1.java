package edu.chitkara.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyProgram1 {

	static void write(char c[]) throws IOException {
		FileWriter writer = new FileWriter("C:/chitkara/welcome3.txt");
		writer.write(c);
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\chitkara\\welcome.txt");
		File file = new File("C:\\chitkara\\welcome.txt");
		char ar[] = new char[(int) file.length()];
		fileReader.read(ar);

		write(ar);
		fileReader.close();
	}
}
