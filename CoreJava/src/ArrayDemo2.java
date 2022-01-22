
public class ArrayDemo2 {
	static void dispArray(int array[]) {
		
		System.out.println("\narray elements ");
		for (int i : array) {
			System.out.print(i + ", ");
		}
	}

	static void dispArray1(int array[][]) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void dispArray2(int array[][]) {

		System.out.println();
		for (int[] is : array) {
			for (int is2 : is) {
				System.out.print(is2 + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr2[] = new int[] { 1, 2, 3, 4, 5 };

		int myarray1[][] = { 
					{ 1, 2, 3 },
					{ 4, 5, 6 }, 
					{ 7, 8, 9 },
					{ 10, 11, 12 }
				};

		System.out.println("first row ");
		int ar1[] = myarray1[0];
		int ar2[] = myarray1[1];
		int ar3[] = myarray1[2];
	
		dispArray(ar1);
		dispArray(ar2);
		dispArray(ar3);
		System.out.println("\nno of rows " + myarray1.length);
		System.out.println("no of cols " + myarray1[0].length);

		System.out.println("\ntwo d array elements are \n");
		dispArray1(myarray1);
		System.out.println("\ntwo d array elements using for each  are \n");
		dispArray2(myarray1);
	}
}
