import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int row, col;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of row and cols");
		row = scanner.nextInt();
		col = scanner.nextInt();

		int ar[][] = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter element ");
				ar[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ar[i][j] + ", ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
