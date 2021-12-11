import java.util.Iterator;

public class Alphabets1 {

	public static void main(String[] args) {
	System.out.println("\tbig alphabet");
		for (int i = 65; i <=90; i++) {
			if(i%5==0)
				System.out.println();
			System.out.print((char)i+"\t");
		}
		
		System.out.println("small alphabet\n");
		for (int i = 97; i <=122; i++) {
			if(i%5==0)
				System.out.println();
			System.out.print((char)i+"\t");
		}
		
		System.out.println("\tDecimal No \n");
		for (int i = 48; i <=57; i++) {
			if(i%5==0)
				System.out.println();
			System.out.print((char)i+"\t");
		}
	}
	
}
