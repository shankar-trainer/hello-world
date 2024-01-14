public class TwoDArray {
	static void display(int ar[][]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j] + ", ");
			}
			System.out.println();
		}
	}
	
	static void display1(int ar[][]) {
		for (int[] is : ar) {
			for (int is2 : is) {
				System.out.print(is2+", ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {

		int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		System.out.println("no of rows " + arr1.length);
		System.out.println("no of cols " + arr1[0].length);

		System.out.println(" first row ");
		for (int a : arr1[0])
			System.out.print(a + ", ");

		System.out.println("\n second  row");
		for (int a : arr1[1])
			System.out.print(a + ", ");

		System.out.println("\nmy two d array ");
		display(arr1);
		
		System.out.println("\nmy two d array using for each loop  ");
		display1(arr1);
	}

}
