public class ArrayDemo2 {

	static void disp(int myarr[][]) {

		System.out.println("  Array \n");
		for (int i = 0; i < myarr.length; i++) {
			for (int j = 0; j < myarr[0].length; j++) {
				System.out.print(myarr[i][j] + "  ");
			}
			System.out.println();
		}
	}

	static int[][] sum(int myarr1[][], int myarr2[][]) {
		int[][] myarr3 =new int[2][3];

		for (int i = 0; i < myarr1.length; i++) {
			for (int j = 0; j < myarr1[0].length; j++) {
				myarr3[i][j] = myarr1[i][j] + myarr2[i][j];
			}
		}
		return myarr3;

	}

	public static void main(String[] args) {

		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int arr3[][] = { { 11, 22, 33 }, { 44, 55, 66 } };


		disp(arr2);
		disp(arr3);
		
		int[][] sum = sum(arr2, arr3);
		disp(sum);
	}
}
