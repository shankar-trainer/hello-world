import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader=new BufferedReader
				 (new InputStreamReader(System.in));
		System.out.println("Enter a number ");
		
		String s=reader.readLine();
		
		int p =Integer.parseInt(s);
		int fact=1;
		int c=1;
		while(c<=p) {
			fact=fact*c;
			c++;
		}
		System.out.println("factorail of "+p+" is "+fact);
	}
}
