
public class ArrayTwoD {
	static void print1(int ar2[]) {
		System.out.println();
		for (int i : ar2)
			System.out.print(i + ", ");

	}

	static void print2(int ar2[][]) {
		// System.out.println("\nrows are " + ar2.length);
		// System.out.println("cols are " + ar2[0].length);
		
		System.out.println("\n two d array \n ");
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[0].length; j++)
				System.out.print(ar2[i][j] + "  ");
			System.out.println();
		}
	}

	static void print3(int ar2[][]) {
		System.out.println("\n using for each loop \n");

		for (int ar[] : ar2) {
			for (int is : ar)
				System.out.print(is + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int arr1[][] = { { 1, 2, 3, 4 }, // arr1[0]
				{ 5, 6, 7, 8 }, // arr1[1]
				{ 11, 22, 33, 44 },

		};

		int ar1[] = arr1[0];
		print1(ar1);
		print1(arr1[1]);
		print1(arr1[2]);
		print2(arr1);
		print3(arr1);
	}
}
