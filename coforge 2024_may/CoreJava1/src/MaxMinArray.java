public class MaxMinArray {
	static int[] display(int arr[]) {

		int min = arr[0], max = arr[0], sum = 0;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] >= max)
				max = arr[i];
			else if (arr[i] <= min)
				min = arr[i];

			sum = sum + arr[i];
		}
		// int result[];
//         result[0]=min;
//         result[1]=max;
//         result[2]=sum;

		int result[] = { min, max, sum };

		return result;
	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int ar[] = new int[10];

		System.out.println("enter 10 no ");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		int arr[] = display(ar);

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}

		System.out.println("\nMin is " + arr[0]);
		System.out.println("Max is " + arr[1]);
		System.out.println("Sum is " + arr[2]);
		sc.close();
	}
}
