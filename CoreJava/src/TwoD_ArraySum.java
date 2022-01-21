
public class TwoD_ArraySum {

	static void dispArray(int ar[][]) {
		System.out.println("\n");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
  static int [][] sumArray(int ar1[][],int ar2[][]){
	  int arr[][]=new int[ar1.length][ar1[0].length];
	
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[0].length; j++) {
			arr[i][j]=ar1[i][j]+ar2[i][j];
			}
		}
	  return arr;
  }
	
	public static void main(String[] args) {
		int arr1[][] = { { 11, 22, 33 }, { 1, 2, 3 }, { 10, 20, 30 }, { 101, 102, 103 }, };
		int arr2[][] = { { 1, 22, 33 }, { 10, 2, 3 }, { 145, 245, 30 }, { 101, 120, 56 }, };
		dispArray(arr1);
		dispArray(arr2);
		System.out.println("\n\nsum of two array ");
		dispArray(sumArray(arr1, arr2));

	}
}
