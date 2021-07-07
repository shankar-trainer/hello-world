
public class Array1 {

	public static void main(String[] args) {
		int arr1[]=new int[5];
		// array of size 5 with 0 values  to each of the element 
		
		System.out.println("Array1");
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" , ");
		}
		
		System.out.println("\nArray2");
		int arr2[]= {1,2,3,4,5};
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" , ");
		}
		
		System.out.println("\nusing for each loop \n");
		for (int i : arr2) {
			System.out.print(i+"  , ");
		}
	}
}
