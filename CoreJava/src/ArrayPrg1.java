
public class ArrayPrg1 {

	public static void main(String[] args) {
		
		int ar[]= {11,22,33,44,55};
		
		int arr1[]=new int[6];//create array of 6 element initializing each element to zero or null
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+"  ");
		}
		
		System.out.println("for each below loop ");
		
		for (int i : ar) {
			System.out.print(i+"  ");
		}
		System.out.println("for each for arr1 ");
		
		for (int i : arr1) {
			System.out.print(i+"  ");
		}
		
	}
}
