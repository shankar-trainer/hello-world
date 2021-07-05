
public class ArraySum {

	static void print(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j] + " , ");
			}
			System.out.println();
		}
	}

	static int[][] arraySum(int a[][], int b[][]) {
		int arr3[][] = new int[4][2];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				arr3[i][j] = a[i][j] + b[i][j];
			}

		}
		return arr3;
	}

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		int arr2[][] = { { 11, 22 }, { 33, 44 }, { 55, 66 }, { 77, 88 } };

		System.out.println("Array1 Elements  are ");
		print(arr1);

		System.out.println("Array2 Elements  are ");
		print(arr2);

		System.out.println("Addition of two arrays   are ");
		
		print(arraySum(arr1, arr2));
	}
}
