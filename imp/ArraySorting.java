
public class ArraySorting {

	public static void main(String[] args) {
		int $12;
		
		int ar[]= {11,2,3,1,5,6};
		int temp;
		
		System.out.println("unsorted array \n");
		for (int i : ar) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <i; j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println("sorted array \n");
		for (int i : ar) {
			System.out.print(i+" ");
		}
		
	}
}
