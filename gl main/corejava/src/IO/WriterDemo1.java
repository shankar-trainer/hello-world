package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo1 {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer=new FileWriter("c:\\welcome\\test1.txt",true);
		
		Scanner sc=new Scanner(System.in);
		
		String s="";
		while(!s.equals("exit123"))
		{
			System.out.println("Enter line of text ");
			sc.nextLine();
			String s1=sc.nextLine();
			
			writer.write(s1.concat("\n"));
		
			System.out.println("type exit123 to come out");
			s=sc.next();
		}
		writer.close();
		sc.close();
		
		FileReader reader=new FileReader("src/IO/WriterDemo1.java");
		int c=0;
		
		while((c=reader.read())!=-1){
			System.out.print((char)c);
		}
		reader.close();
		
	}
}
