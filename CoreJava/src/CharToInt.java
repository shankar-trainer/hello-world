
public class CharToInt {

	public static void main(String[] args) {
		int x = 97;
		System.out.println(x);
		System.out.println((char) x);

		char c = 'A';
		System.out.println(c);
		System.out.println((int) c);

		/*
		 * 0 to 255 ASCII
		 */
		System.out.println("ASCII code");
		for (int i = 0; i <= 255; i++) {
			System.out.print(i + "\t" + (char) i+"\t");
			if (i % 5 == 0)
				System.out.println();
		}
	}
}
