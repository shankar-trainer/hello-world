
public class Scolar {
	static int[] sum(int ar[][]) {
		int arr1[] = new int[5];

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				arr1[i] = arr1[i] + ar[i][j];
			}
		}
		return arr1;
	}

	static void display(int m[], String nm[]) {
		for (int i = 0; i < nm.length; i++) {
			System.out.println(nm[i] + " :  " + m[i]);
		}
	}

	public static void main(String[] args) {
		int marks[][] = { { 76, 78 }, { 68, 87, 69 }, { 84 }, { 84, 58, 68, 72, 71 }, { 64, 81, 59, 62 } };
		String names[] = { "Raj", "Rishi", "Pooja", "Pranshu", "Prateek" };
		int res[] = sum(marks);
		display(res, names);
	}
}
