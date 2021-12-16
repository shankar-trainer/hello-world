import java.util.Iterator;
import java.util.Scanner;

public class MatrixAddition {

	static void display(int ar[][]) {
		System.out.println("***************************");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("***************************");
	}

	static int[][] additionofmatrix(int arr1[][], int arr2[][]) {
		int myarr1[][] = new int[arr1.length][arr1[0].length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				myarr1[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return myarr1;
	}

}
