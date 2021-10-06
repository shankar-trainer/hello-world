package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("c:/welcome/abc.txt"));
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		System.out.println("mark called ");
		
		System.out.println(br.readLine());
		br.mark(10);
		System.out.println(br.readLine());
		
		br.reset();
		
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		
		
		
	}
}
