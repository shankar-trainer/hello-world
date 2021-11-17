import java.util.Iterator;

public class Alphabets {

	public static void main(String[] args) {
		for (int i = 65; i <=90; i++) {
			if(i%5==0)
				System.out.println();
			System.out.print((char)i+"\t");
		}
		
		System.out.println("another way ");
		
		int x=0;
		for (char c='A' ; c <='Z'; c++) {
			if(x%5==0)
				System.out.println();
			System.out.print(c+"\t");
			x++;
		}
		
		System.out.println("\n  1 to 10 ");
		
		for (int i = 48; i <=57; i++) {
			System.out.print((char)i+"\t");
			if(i%5==0)
			System.out.println();
		}
	
	}
}
