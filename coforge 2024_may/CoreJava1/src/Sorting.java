public class Sorting {
	
	static int[] bubbleSort(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length-i-1; j++) {
				if(ar[j]>ar[j+1]) {
				 temp=ar[j];
				 ar[j]=ar[j+1];
				 ar[j+1]=temp;
				}
			}
		}
		return ar;
	}
	static void display(int ar[]) {
		for (int i : ar) {
			System.out.print(i+", ");
		}
	}
	
	public static void main(String[] args) {
		
		int ar[]= {11,1,2,33,4,5};
		System.out.println("unsorted array elements ");
		display(ar);
         		
		System.out.println("\nsorted array elements ");
		display(bubbleSort(ar));
		
		
		
	}
}
