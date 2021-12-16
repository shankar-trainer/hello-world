
public class Array1 {

	public static void main(String[] args) {
		
		int ar[]= {11,22,33,44,55};
		int ar1[]=new int[3];// will create array of 3 elements and initialize each element with 0
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		System.out.println("length of array "+ar.length);
		System.out.println("array1");
		for (int i = 0; i < ar.length; i++) {
			System.out.print("\t"+ar[i]);
		}
		
		System.out.println("\narray2");
		for (int i = 0; i < ar1.length; i++) {
			System.out.print("\t"+ar1[i]);
		}
	}
}
