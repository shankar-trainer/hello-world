
public class Array1 {

	public static void main(String[] args) {
		
		int arr1[]=new int[5];
		
		System.out.println("array1 elements are");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ,");
		}
		
		int arr2[]= {11,20,3,4,12};
		
		System.out.println("\narray2 elements using for loop");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" --  ");
		}
		
		System.out.println("\narray2 elements using for  each loop");
		
		int sum=0;
		for (int i : arr2) {
			System.out.print(i+"  ");
		  sum=sum+i;
		}
		System.out.println("\nsum is  "+sum);
		
	}
}
