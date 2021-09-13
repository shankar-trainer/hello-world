
public class ArrayDemo1 {

	
	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5};
		  // size is fixed
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[4]);
		System.out.println(ar.length);
				
		System.out.println(ar[ar.length-1]);
		int sum=0;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+"  , ");
			sum=sum+ar[i];
		}
		 System.out.println("\nsum1 is "+sum);
		 sum=0;
		System.out.println("\n using  for each ");
		
		
		for (int i : ar) {
			System.out.println(i);
			sum=sum+i;
		}
		
		System.out.println("sum2 is "+sum);
		
		
	}
}
