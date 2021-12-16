
public class Sorting {

	public static void main(String[] args) {

		int temp;

		int ar[] = { 11, 2, 1, 3, 5, };
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j < ar.length - 1 - i; j++) {
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		System.out.println("after sorting ");
		for (int k : ar) {
			System.out.print(k+" ");
		}


	}
}
