
public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		int arr2[]=new int[4];// create array of 4 elements and initialize with 0
		
		int arr3[]=new int[] {66,44,66,77,88};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+", ");
		}
		
		System.out.println("\n for each ");
		
		for (int i : arr1) {
			System.out.print(i+", ");
		}
		
		System.out.println("\n for each ");
		
		for (int i : arr2) {
			System.out.print(i+", ");
		}
		
	}
}
