
public class ArrayPrg1 {

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };

		System.out.println(ar.length);

		System.out.println("array 1");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " , ");
		}
		System.out.println("using foreach ");
		int sum = 0;
		
		for (int i : ar) // for each 
		{
			System.out.println(i);
			sum = sum + i;
		}
		System.out.println("sum is " + sum);

		int ar2[] = new int[5];
		ar2[0] = 11;
		ar2[1] = 21;
		ar2[2] = 22;
		ar2[3] = 23;
		ar2[4] = 24;

		System.out.println("\narray two\n");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + ", ");
		}

		// System.out.println(ar2[5]);

	}
}
