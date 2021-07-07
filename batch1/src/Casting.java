import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Casting {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		
		
		int x=989889;
		
		long l1=x;// widening 
		
		
		byte b1=(byte) x;//higher range to lower range
		                // narrowing -- cast operator 
		
		System.out.println(x+"     "+b1);
		
		float h1=x;// widening 
		
		int y=(int) h1;// narrowing
		
		int z=67;
		
		System.out.println(z+"  "+(char)z);
		
		char c1=(char) z;
		
		
		System.out.println(c1);
		char p='A';
		int p1=p;
		System.out.println(p1);
	}
}
