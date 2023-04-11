
public class ArrayPrg1 {

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4};
		
		int ar2[]=new int[5];// size of 5 and initialization with 0 
		
		System.out.println("array1");
		for (int i : ar1) {
			System.out.println(i);
		}
		
		
		System.out.println("\narray2");
		for (int i : ar2) {
			System.out.println(i);
		}
		
		
	}
	
	
}
