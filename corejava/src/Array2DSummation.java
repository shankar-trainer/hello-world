public class Array2DSummation {
	static void print3(int ar2[][]) {
		for (int ar[] : ar2) {
			for (int is : ar)
				System.out.print(is + "\t");
			System.out.println();
		}
	}

	static int[][] sum(int ar2[][], int ar3[][]) {
		// int ar34[][]=new int[3][3];
		int ar4[][] = new int[ar2.length][ar2[0].length];
		for (int x = 0; x < ar4.length; x++) {
			for (int y = 0; y < ar4[0].length; y++) 
				ar4[x][y] = ar2[x][y] + ar3[x][y];
		}
		return ar4;
	}

	public static void main(String[] args) {
		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int arr2[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		System.out.println("array1");
		print3(arr1);
		System.out.println("array2");
		print3(arr2);
		System.out.println("addition result is \n");
		print3(sum(arr1,arr2));

	}
}
