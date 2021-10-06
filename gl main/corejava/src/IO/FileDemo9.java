package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDemo9 {

	public static void main(String[] args) throws IOException {

		FileInputStream stream = new FileInputStream("c:/welcome/abc.txt");
		int x = stream.read();

		int i = 0;

		while (x != -1) {
			char c = (char) x;
			System.out.print(c);
			x = stream.read();
			i++;

			if (i == 30) {
				stream.mark(50);
				System.out.println("mark called");
			}
		}

		stream.reset();
		System.out.println("reset called");
		x = stream.read();

		while (x != -1) {
			char c = (char) x;
			System.out.print(c);
			x = stream.read();
		}

		stream.close();
	}
}
