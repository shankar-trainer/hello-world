
public class ArraySort {
	static void  arraySort(int ar[]) {
	    int temp;
		for (int i = 0; i <ar.length-1; i++) {
			 for (int j = 0; j <ar.length-i-1 ; j++) {
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		} 
		//return ar;	
		arrayDisp(ar);
	}
	
	static void  arrayDisp(int ar[]) {
		 System.out.println("\n array display \n");
		for (int i : ar) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
	 int myarray1[]= {11,2,1,3,4,0,22,19,10};	
	 int myarray2[]= {1,2,11,3,44,0,2,13,9};	
	
	 arrayDisp(myarray1);
	 arraySort(myarray1);
	 
	 arrayDisp(myarray2);
	 arraySort(myarray2);
	}
}
