package IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo8 {

	public static void main(String[] args) throws IOException {
		 
		//FileOutputStream stream=new FileOutputStream("c:/welcome/abc.txt",true);
	 
		//BufferedOutputStream stream2=new BufferedOutputStream(stream);
		BufferedOutputStream stream2=new BufferedOutputStream(new FileOutputStream("c:/welcome/abc.txt",true));
		Scanner scanner=new Scanner(System.in);
		
		for (int i = 0; i <4; i++) {
		    stream2.write(scanner.nextLine().concat("\n").getBytes());	
		}
		
		//stream.close();
		stream2.close();
		scanner.close();
	}
}
