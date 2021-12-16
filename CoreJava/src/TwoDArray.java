import java.util.Iterator;

public class TwoDArray {

	public static void main(String[] args) {

		int ar1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		// 2 D array of 4 rows 3 cols
		System.out.println("no of rows " + ar1.length);
		// ar1[0] {1,2,3}
		// ar1[1] {4,5,6}
		System.out.println("no of cols " + ar1[0].length);
		System.out.println("no of cols " + ar1[1].length);

		System.out.println("first row ");
		for (int r : ar1[0])
			System.out.print(" " + r);

		System.out.println("\nsecond row ");
		for (int r : ar1[1])
			System.out.print(" " + r);

		System.out.println("\nwhole matrix ");

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[0].length; j++) {
				System.out.print(ar1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
