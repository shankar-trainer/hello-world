public class TwoDArray {

	static int[][] sumofarray(int[][] a, int b[][]) {
		int ar3[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				ar3[i][j] = a[i][j] + b[i][j];
			}
		}
		return ar3;
	}

	static void printarray(int[][] a) {
		System.out.println("Array elements  ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int ar1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }

		};
		int ar2[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 }, { 1, 1, 1 } };

		printarray(ar1);
		printarray(ar2);
		printarray(sumofarray(ar1, ar2));
	}

}
