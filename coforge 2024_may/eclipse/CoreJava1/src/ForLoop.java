public class ForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ",  ");
		}

		System.out.println();
		int k = 3;
		for (; k <= 20;) {
			System.out.print(k + ",  ");
			k = k + 3;
		}
		System.out.println();

		for (int i = 1, j = 5; i <= 10; i++, j = j + 5) {
			System.out.println(i + "  " + j);
		}
		// infinite loop
		for (;;) {
			System.out.println("infinite loop");
		}

	}
}
