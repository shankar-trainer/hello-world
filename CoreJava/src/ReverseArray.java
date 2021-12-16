public class ReverseArray {
	static void dispArray(int ar[]) {
		System.out.println("Array Values");
		for (int i : ar) {
			System.out.print(i + "   ,");
		}
		System.out.println("\n-------------------------\n");
	}

	static int[] reverseArray(int array1[]) {
		int array2[] = new int[array1.length];
		int x = 0;
		for (int k = array1.length - 1; k >= 0; k--) {
			array2[k] = array1[x++];
		}
		return array2;
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		dispArray(ar);
		int ar1[] = reverseArray(ar);
		System.out.println("Reverse of array");
		dispArray(ar1);
	}
}
