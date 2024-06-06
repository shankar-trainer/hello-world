
public class Array1 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7}; // in line initialization
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr.length);
		
		System.out.println("\n using for loop ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.println("\n using for each loop  ");
		//for each
		
		for (int i : arr) {
			System.out.print(i+",   ");
		}
	}
}
