
public class Alphabets2 {

	public static void main(String[] args) {

		System.out.println("\tbig alphabet");

		int x = 1;
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + "\t");
			if (x % 5 == 0)
				System.out.println();
			x++;
		}
		
		System.out.println("\tsmall alphabet");
		
		x = 1;
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + "\t");
			if (x % 5 == 0)
				System.out.println();
			x++;
		}

	}
}
