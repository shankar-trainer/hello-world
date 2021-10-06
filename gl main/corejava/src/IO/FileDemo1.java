package IO;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		File file=new File("c:\\");
		
		System.out.println("c:\\ is directory "+file.isDirectory());
		System.out.println("c:\\ is file "+file.isFile());
		System.out.println("path is "+file.getPath());
		
		String ar[]=	file.list();
		for (String string : ar) {
			File file1=new File(file.getPath()+string);
			if(file1.isDirectory())
			System.out.println("<DIR>  "+file.getPath()+string);
			else
				System.out.println("<FILE>  "+file.getPath()+string);
				
		}
		
	}
	
}
