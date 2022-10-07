public class matrix_2d {

	static void printar1(int a[][]) {
		for (int[] is : a) {
			for (int p : is) {
				System.out.print(p + "\t");
			}
			System.out.println();
		}
	}

	static int[][] sum_ar1(int a[][],int b[][]) {
		int arr3[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				arr3[i][j] = a[i][j]+b[i][j];
			}
		}
		return arr3;
	}

	public static void main(String[] args) {
		int ar[][] = { // 4 X 3
				{ 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		int ar1[][] = { { 6, 7, 8 }, { 11, 22, 33 }, { 1, 2, 3 }, { 4, 5, 6 } };

//		System.out.println("no of row "+ar.length);
		// System.out.println("no of column "+ar[0].length);
//		printar(ar);
		System.out.println("Array1");
		printar1(ar);

		System.out.println("Array2");
		printar1(ar1);
		System.out.println("Addition of array1 and array2 \n");
		
		printar1(sum_ar1(ar,ar1));
	}
}
