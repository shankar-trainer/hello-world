
public class Array1 {

	
	public static void main(String[] args) {
		
		
		int arr1[]= {1,2,3,4,5,6};
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ,");
		}
	
		System.out.println("\nusing foreach loop ");
		
		int sum=0;
		for (int i : arr1) {
			System.out.print(i+" , ");
		  sum=sum+i;
		}
		
		System.out.println("\n sum is "+sum);
	}

	
}
