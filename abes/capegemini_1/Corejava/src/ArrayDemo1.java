
public class ArrayDemo1 {

	public static void main(String[] args) {
		int ar[]=new int[5];
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+"  ");
		}
		
		System.out.println();
		int ar2[]={1,2,3,4,5,6,7};
		
		for (int i = 0; i < ar2.length; i++) {
			System.err.print(ar2[i]+"  ");
		}
		System.out.println("using for each");
		for (int i : ar2) {
			System.out.print(i+"  ");
		}
		
		
	}
}
