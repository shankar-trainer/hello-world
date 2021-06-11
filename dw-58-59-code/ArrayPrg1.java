
public class ArrayPrg1 {

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5};
		int ar2[]=new int[5];
		
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]);
		System.out.println(ar2[3]);
		
		System.out.println("array  using for loop");
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
		System.out.println("array  using for each  loop");
		
		for (int i : ar1) {
			System.out.print(i+"  ");
		}
		
	}
}
