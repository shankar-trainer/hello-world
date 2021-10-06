package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo6 {

	public static void main(String[] args) throws IOException {
		 FileOutputStream stream2=new FileOutputStream("c:/welcome/product.csv");
		 
		 String col[]={"id","pname","cost"};
		 
		 for (String string : col) {
			stream2.write((string+",").getBytes());
		}
		 stream2.write("\n".getBytes());
		 
		 Scanner scanner=new Scanner(System.in);
		 
		 for (int i = 0; i <=4; i++) {
			System.out.println("Enter id name cost");
			for (int j = 0; j <=2; j++)
			stream2.write((scanner.nextLine()+",").getBytes());
			
			stream2.write("\n".getBytes());
		}
		 stream2.close();
		 scanner.close();
	}
}
