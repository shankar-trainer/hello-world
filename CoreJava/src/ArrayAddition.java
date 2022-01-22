
public class ArrayAddition {

	
	static void dispArray1(int array[][]) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int [][] additionArray1(int array1[][], int array2[][] ) {
		int array3[][]=new int[array1.length][array1[0].length];
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[0].length; j++) {
			array3[i][j]=array1[i][j]+array2[i][j];
			}
		}
		return array3;
	}

	
	public static void main(String[] args) {
		int myarray1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, };
		int myarray2[][] = { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 }, 
				{ 100, 101, 102 }, };
	
		dispArray1(myarray1);
		dispArray1(myarray2);
	
		System.out.println("\n Addition of two array \n");
		dispArray1(additionArray1(myarray1,myarray2));
	}
	
}
