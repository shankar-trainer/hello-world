public class SumOfArray {
	static void sumOfArray(int a[][],int b[][]){
		int arr3[][]=new int[3][3];
		  System.out.println("\nSum Of Array  ");
				
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
		      arr3[i][j]=a[i][j]+b[i][j];		
			  System.out.print(arr3[i][j]+",  ");
			}
			System.out.println();
		}
	}
	
	static void dispArray(int ar[][]) {
	  System.out.println("\nArray Values ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
		      System.out.print(ar[i][j]+",  ");
			}
			System.out.println();
		}
    
	}

	
	public static void main(String[] args) {
		int arr1[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
			
			int arr2[][]={
				{9,8,7},
				{6,5,4},
				{3,2,1}
			};
			dispArray(arr1);
			dispArray(arr2);
			sumOfArray(arr1, arr2);
	}
}
