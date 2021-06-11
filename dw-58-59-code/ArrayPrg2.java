
public class ArrayPrg2 {

	int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
	int arr2[][] = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };

	int arr3[][]=new int[3][3];

	int[][] arraySum() {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return arr3;
	}

	void printArray(int ar[][]) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
			  System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		ArrayPrg2 arrayPrg2 = new ArrayPrg2();
		System.out.println("\n Array1\n");
		arrayPrg2.printArray(arrayPrg2.arr1);
		System.out.println("\n Array2\n");
		arrayPrg2.printArray(arrayPrg2.arr2);
		System.out.println("\n Sum of  Array\n");
		arrayPrg2.printArray(arrayPrg2.arraySum());
	}
}
