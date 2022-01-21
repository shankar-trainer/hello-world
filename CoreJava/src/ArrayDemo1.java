
public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } }; // 4 rows 3 columns
		System.out.println("no of rows " + arr1.length);
		System.out.println("no of cols " + arr1[0].length);

		int ar[] = arr1[0];
		System.out.println("first row ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		ar = arr1[1];
		System.out.println("\nsecond  row ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		// for each java 5
		System.out.println("\n for each loop \n");
		for (int i : ar) {
			System.out.print(i + " ");
		}

		System.out.println("\n whole array \n");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

	}
}
