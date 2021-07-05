
public class ArrayPrg1 {

	public static void main(String[] args) {
		int ar1[]=new int[5];
		int arr2[]= {11,22,33,44,55};
		
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+" , ");
		}
		
		System.out.println("\nusing for loop display array values");
	
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ,  ");
		}
		
		System.out.println("\nusing for each  loop display array values");
		int sum=0;
		for (int i : arr2) {
			sum=sum+i;
			System.out.print(i+" , ");
		}
		
		System.out.println("\nsum is "+sum);
	}
}
