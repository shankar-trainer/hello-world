public class MaxMIn {
	static int sum(int arr[]) {
		int sum = 0;
		for (int i : arr) {
			sum = sum + i;
		}
		return sum;
	}
	static int[] minmax(int array[]) {
		int result[]=new int[2];
		int max=0,min=0;
		
		for (int i = 0; i < array.length; i++) {
			if(i==0)
				max=min=array[i];
			else if(array[i]>=max) {
				max=array[i];
			}
			else if(array[i]<=min) {
				min=array[i];
			}
		}
		result[0]=max;
		result[1]=min;
		return result;
	}

	public static void main(String[] args) {
		int ar[] = { 11, 2, 3, 1, 4, 5, 66, 7, 900 };

		System.out.println("using for loop \n");

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ",  ");
		}
		System.out.println("using for each \n");

		for (int i : ar) {
			System.out.print(i + ",  ");
		}
		System.out.println("\nsum of array is "+sum(ar));
		
		System.out.println("max is "+minmax(ar)[0]);
		System.out.println("min is "+minmax(ar)[1]);
	}
}
