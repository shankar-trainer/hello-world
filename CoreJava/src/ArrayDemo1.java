
public class ArrayDemo1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4};// 
		
		int ar1[]=new int[5];// initialised with zero
	
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" , ");
		}
	
		for (int i : ar) // for each loop
		{
			System.out.println(i);
		}
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+" ");
		}
	}
}
