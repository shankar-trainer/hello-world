
public class PrimeNo {

	public static void main(String[] args) {

		hello: 
			for (int i = 1; i <= 5; i++) {
			// hello:
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
				if (j >= 5)
					continue hello;
			}
			System.out.println();
		}

	}

}
