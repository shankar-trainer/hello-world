
public class Sorting {

	public static void main(String[] args) {

		int ar[] = { 33, 4, 2, 7, 9 };
		int temp;
		for (int x = 0; x < ar.length - 1; x++) {

			for (int y = 0; y < ar.length - 1; y++) {
				if (ar[y] >= ar[y+1]) {
					temp = ar[y];
					ar[y] = ar[y+1];
					ar[y+1] = temp;
				}
			}

		}
		for (int a : ar)
			System.out.println(a);

	}

}
