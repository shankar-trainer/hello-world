
public class SortArray {

	public static void main(String[] args) {
		
		int arr[]= {11,2,3,1,4,55};
		
		System.out.println("before sorting array elements are\n");
		
		for (int i : arr) {
			System.out.print(i+",");
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				int temp;
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		
	System.out.println("\nafter sorting array elements are\n");
		
		for (int i : arr) {
			System.out.print(i+",");
		}
			
		
	}
}
