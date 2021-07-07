import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop4 {

	public static void main(String[] args) throws IOException {
		

		BufferedReader reader=new BufferedReader
				 (new InputStreamReader(System.in));
		System.out.println("Enter a number ");
		
		String s=reader.readLine();
		
		int p =Integer.parseInt(s);
		
		for (int i = 1; i <=10; i++) {
			System.out.println(i+" * "+p+" = "+(i*p));
		}
		
	}
}
