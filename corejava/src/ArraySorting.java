
public class ArraySorting {

	static int [] sorting(int ar[]) {
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j <ar.length-1-i; j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		return ar;
	}

	static void print(int ar2[]) {
		System.out.println();
	   for (int i : ar2) {
		System.out.print(i+",");
	}
	}
	public static void main(String[] args) {
	 int ar[]= {1,3,2,5,4,1,6};
	  System.out.println("unsorted array\n");
	   print(ar); 
	   System.out.println("sorted array\n");
	   print(sorting(ar)); 
	}
}
