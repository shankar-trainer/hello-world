
public class ArrayDemo1 {

	public static void main(String[] args) {
		int ar1[]= {1,2,3,4,5};
		int ar2[]=new int[5];// initialize all elements  with zero values 
	
		System.out.println(ar1.length);// length property
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
	
		System.out.println("access all elements by for loop ");
		for (int i = 0; i < ar1.length; i++) 
			System.out.print(ar1[i]+" , ");
		
		System.out.println("\naccess all elements by for each  loop\n ");
		
		for(int i:ar1)// added in java5
			System.out.print(i+" ,");
		
		System.out.println("\naccess all elements of ar2 by for each  loop\n ");
		
		for(int i:ar2)// added in java5
			System.out.print(i+" ,");
		
		
	}
}
