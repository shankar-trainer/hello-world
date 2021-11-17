
public class SortingArray {

	public static void main(String[] args) {
		int ar[] = { 5, 2, 3, 1, 11, 0, 9 };
		int temp;

		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}

		for (int j : ar) {
			System.out.print(j + " ,");
		}
	}

}
