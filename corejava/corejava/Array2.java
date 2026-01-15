
public class Array2 {

	static void displayArray1(int myarr1[][]) {

		for (int i = 0; i < myarr1.length; i++) {
			for (int j = 0; j < myarr1[0].length; j++) {
				System.out.print(myarr1[i][j] + ",");
			}
			System.out.println();
		}
	}
	
	static int[][] sumOfArray(int a1[][], int a2[][]){
		 int a3[][]=new int[a1.length][a1[0].length];
		 for (int i = 0; i < a1.length; i++) {
		    for (int j = 0; j < a1[0].length; j++) {
				a3[i][j]=a1[i][j]+a2[i][j];
			}	
		}
		 return a3;
	}

	static void displayArray2(int myarr1[][]) {
		for (int[] is : myarr1) {
			for (int i : is) {
				System.out.print(i + ",");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int arr1[] = new int[] { 1, 2, 3, 4, 5 }; // anonymous array

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}

		System.out.println("\nfor each loop ");
		for (int i : arr1) { // for each loop , works with array and collection
			System.out.print(i + ", ");
		}

		int ar1[][] = { // 2 d array of 3 rows 4 columns
				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 1 }, };

		int ar2[][] = { // matrix of 3 rows and 4 cols
				{ 9, 10, 11, 1 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 } };

		System.out.println("\nar1 row length is " + ar1.length);
		System.out.println("ar1 column length is " + ar1[0].length);
		System.out.println("\nfirst row of ar1 ");

		for (int i : ar1[0]) {
			System.out.print(i + ", ");
		}
		System.out.println("\narray1 is using for loop");

		displayArray1(ar1);

		System.out.println("\narray2 is using for each loop");
		displayArray2(ar2);
	
		System.out.println("\nsum of array1 and array2");
		displayArray2(sumOfArray(ar1, ar2));
		
		
	
	}
}
