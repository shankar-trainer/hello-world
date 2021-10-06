package IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		 
		FileOutputStream stream=new FileOutputStream("c:/welcome/abc.txt",true);
		
		byte b[]={1,2,3,4};
		
		stream.write(b);
		stream.write("\n byte written".getBytes());
		
		Scanner scanner=new Scanner(System.in);
		
		for (int i = 0; i <4; i++) {
		    stream.write(scanner.nextLine().concat("\n").getBytes());	
		}
		stream.close();
		scanner.close();
	}
}
