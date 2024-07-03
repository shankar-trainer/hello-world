
public class Array2 {

	public static void main(String[] args) {
		int ar[]=new int[5];
		
		for (int i : ar) {
			System.out.print(i+", ");
		}
		
		ar[0]=111;
		ar[1]=222;
		ar[2]=333;
		ar[3]=444;
		ar[4]=555;
		
		System.out.println();
		for (int i : ar) {
			System.out.print(i+", ");
		}
		
		
	}
}
