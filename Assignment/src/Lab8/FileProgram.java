package Lab8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileProgram {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream("source.txt");
		FileOutputStream outputStream = new FileOutputStream("target.txt");
		new CopyDataThread(inputStream, outputStream).start();
	}
}
