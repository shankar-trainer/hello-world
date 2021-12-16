
public class Array2 {

	public static void main(String[] args) {
		
		int ar[]= {11,22,33,44,55};

		int sum=0;
		System.out.println("array1");
		for (int i = 0; i < ar.length; i++) {
			sum=sum+ar[i];
			System.out.print("\t"+ar[i]);
		}
		System.out.println("\nsum is "+sum);
		System.out.println("\narray1 using for each ");
		
		for (int i : ar) {
			System.out.print("\t"+i);
		}
		
	}
}