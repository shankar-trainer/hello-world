package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("src/IO/WriterDemo1.java"));

		String s = null;

		while ((s = br.readLine()) != null) {
			System.out.println(s);

		}

		br.close();

	}
}
