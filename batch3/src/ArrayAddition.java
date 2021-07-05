
public class ArrayAddition {

	static void display(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}

	static int[][] arrayAddition(int a[][], int b[][]) {
		int array3[][] = new int[a.length][a[0].length];

		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[0].length; j++) {
				array3[i][j] = a[i][j] + b[i][j];
			}
		}
		return array3;
	}

	public static void main(String[] args) {
		int ar1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		int ar2[][] = { { 12, 15, 1 }, { 22, 33, 2 }, { 44, 55, 3 }, { 66, 77, 4 } };

		System.out.println("array1 elements are ");
		display(ar1);

		System.out.println("array2  elements are ");
		display(ar2);
		System.out.println("Addition of two arrays");
		display(arrayAddition(ar1, ar2));

//		System.out.println("rows "+ar1.length);
		// System.out.println("columns "+ar1[0].length);
	}
}
