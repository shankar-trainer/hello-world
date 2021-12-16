
public class matrixTranspose {

	static void display(int ar[][]) {
		System.out.println("***************************");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("***************************");
	}

	static int[][] transpose(int ar[][]) {
		                      //[row]ar.length[cols]ar[0].length
		
		int arr1[][] = new int[ar[0].length][ar.length];

		for (int i = 0; i < ar[0].length; i++) {
			for (int j = 0; j < ar.length; j++) {
				arr1[i][j] = ar[j][i];
			}
		}
		return arr1;
	}

	public static void main(String[] args) {

		int matrix1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },

		};
		display(matrix1);

		display(transpose(matrix1));

	}
}
