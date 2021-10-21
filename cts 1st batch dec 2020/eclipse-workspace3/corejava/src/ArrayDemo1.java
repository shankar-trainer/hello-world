
public class ArrayDemo1 {

	public static void main(String[] args) {
           // two way of initialisation
		int ar[] = { 1, 2, 3, 4 };
		int arr1[] = new int[4];

		int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int arr3[][] = { { 11, 22, 33 }, { 44, 55, 66 } };
		int arr4[][]=new int [2][3];
		
		System.out.println("Second  Array");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr3[i][j] + "  ");
			 arr4[i][j]=arr2[i][j]+arr3[i][j];
			}
			System.out.println();
		}
		System.out.println(arr3.length);// row count
		System.out.println(arr3[0].length);// column count

		System.out.println("First Array");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("Second  Array");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr3[i][j] + "  ");
			 arr4[i][j]=arr2[i][j]+arr3[i][j];
			}
			System.out.println();
		}
		

		System.out.println("Sum of two   Array\n");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[0].length; j++) {
				System.out.print(arr4[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}
