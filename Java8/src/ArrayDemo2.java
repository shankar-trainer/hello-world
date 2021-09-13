
public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 45, 5 };
		int[] ar2 = new int[7]; // all array elements with zeo

		System.out.println(ar2[0]);
		System.out.println(ar2[1]);
		System.out.println(ar2[2]);
		System.out.println(ar2[3]);

		ar2[0] = 11;
		ar2[1] = 22;
		ar2[2] = 33;
		ar2[3] = 44;
		ar2[4] = 55;
		ar2[5] = 66;
		ar2[6] = 77;

		for (int i : ar2) {
			System.out.print(i + " ,");
		}

		int ar3[][] = { { 1, 2, 3, 4 }, { 5, 6, 3, 7 }, { 8, 9, 10, 11 },

		};

		System.out.println("\nfirst row ");
		for (int is : ar3[0]) {
			System.out.print(is + " , ");
		}

		System.out.println("\nsecond  row\n ");
		for (int x = 0; x < ar3[0].length; x++) {
			System.out.print(ar3[1][x] + " , ");
		}

		System.out.println("\n  no of rows  " + ar3.length);
		System.out.println("  no of cols  " + ar3[0].length);

		System.out.println("old for loop");
		for (int i = 0; i < ar3.length; i++) {
			for (int j = 0; j < ar3[0].length; j++) {
				System.out.print(ar3[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("\n using  for each ");
		for (int[] is : ar3) {
			for (int is2 :is ) {
				System.out.print(is2+" ");
			}
			System.out.println();
			
		}
		
	}
}
