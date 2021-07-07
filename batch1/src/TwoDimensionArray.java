public class TwoDimensionArray {

	static void print(int array[][]) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] sum(int array1[][], int array2[][]) {

		int array3[][] = new int[array1.length][array1[0].length];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[0].length; j++) {
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		}
		return array3;
	}

	public static void main(String[] args) {

		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		int arr2[][] = { { 111, 222, 333 }, { 444, 555, 666 }, { 777, 888, 999 }, { 1, 2, 3 } };

		System.out.println("\nArray1 Elements are \n ");
		print(arr1);

		System.out.println("\nArray2 Elements are \n ");
		print(arr2);

		int array_sum[][] = sum(arr1, arr2);

		System.out.println("Sum of array ");
		print(array_sum);

		// System.out.println(arr1.length);//4 no of rows
		// System.out.println(arr1[0].length); //3 no of column

	}
}
