package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {

		// System.out.println(Integer.MAX_VALUE);//2147483647
		/*
		 * Scanner scanner=new Scanner(System.in);
		 * 
		 * int x=scanner.nextInt();
		 * 
		 * System.out.println(x);//45678988888
		 */
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name");
		String name = reader.readLine();

		System.out.println("Enter 2 no ");
		String s = reader.readLine();

		int x = Integer.parseInt(s);
		s = reader.readLine();
		int y = Integer.parseInt(s);

		System.out.println("name is "+name);
		System.out.println("sum is "+(x+y));
	}
}
