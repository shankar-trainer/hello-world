
public class Array1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6};
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println("length is "+ar.length);
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ,   ");
		}
		
		System.out.println("\nusing for each loop  \n");
		
		int sum=0;
		for (int i : ar) {
		    sum=sum+i;;;;;;;
			System.out.println(i);	
		}
		System.out.println("sum is "+sum);
	}
}
