public class ArrayAddition2 {
	static void arrayDisp(int a[][]) {
		for (int i[] : a) {
			for (int j : i) {
				System.out.print(j + ", ");
			}
			System.out.println();
		}
	}

	static int[][] arrayAddition(int a[][], int b[][]) {
		int ar4[][] = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				ar4[i][j] = a[i][j] + a[i][j];
			}
		}
		return ar4;
	}


	public static void main(String[] args) {
		// 3 x 4 array
		int ar1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 8, 2, 30, 44 }, };
		int ar2[][] = { { 11, 22, 30, 40 }, { 55, 66, 7, 80 }, { 18, 12, 30, 44 }, };
		System.out.println("first array\n");
		arrayDisp(ar1);

		System.out.println("second array\n");
		arrayDisp(ar2);

		System.out.println("sum of arrays\n");
		arrayDisp(arrayAddition(ar1, ar2));
	}
}
