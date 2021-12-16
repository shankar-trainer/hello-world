import java.util.Scanner;

public class MatrixAdditionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows and cols ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ar1[][] = new int[x][y];
		int ar2[][] = new int[x][y];
		int ar3[][] = new int[x][y];

		System.out.println("Enter elements for the matrix1");

		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[0].length; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter elements for the matrix2");

		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[0].length; j++) {
				ar2[i][j] = sc.nextInt();
			}
		}

		MatrixAddition.display(ar1);
		MatrixAddition.display(ar2);
		ar3 = MatrixAddition.additionofmatrix(ar1, ar2);
		MatrixAddition.display(ar3);

		sc.close();
	}

}
