
public class Array1 {

	public static void main(String[] args) {
		
		
		int ar1[]= {11,22,33,44,55};
		
		int ar2[]=new int[5];
		
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		
		//System.out.println(ar1[5]);
		
		System.out.println(ar1.length);
		
		
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]);
		System.out.println(ar2[3]);
		
		for (int i = 0; i < ar1.length; i++) {
			System.out.print(ar1[i]+",  ");
		}
		
		System.out.println("using for each loop ");
		
		for (int i : ar1) {
			System.out.print(i+", ");
		}
		
	}
}
