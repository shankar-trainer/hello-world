
public class StringTest2 {

	public static void main(String[] args) {

		char c = 'a';
		System.out.println(c);
		System.out.println((int) c);
		System.out.println("capital  alphabet ");

		for (int i = 65; i < 91; i++) {
			System.out.print((char) i + "   ");
			if (i % 5 == 0)
				System.out.println();
		}

		System.out.println("small alphabet");
		int x = 0;
		for (char p = 'a'; p <= 'z'; p++) {
			System.out.print(p + "\t");
			x++;
			if (x % 5 == 0)
				System.out.println();
		}
	}
}
