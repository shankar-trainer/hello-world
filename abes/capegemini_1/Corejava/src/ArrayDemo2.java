public class ArrayDemo2 {
	static int[][]sum(int ar1[][], int ar2[][]){
		int ar3[][]=new int[3][4];
		
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <4; j++) {
				ar3[i][j]=ar1[i][j]+ar2[i][j];
			}
		}	
		return ar3;
	}
	
	static void disp(int arr[][]){
		for (int i = 0; i <3; i++) {
			for (int j = 0; j <4; j++) {
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
	}
	
	static void disp1(int arr[][]){
		for (int ar[]:arr) {
			for (int j:ar) {
				System.out.print(j+"   ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr1[][]={
				{3,4,5,6},	
				{2,47,59,56},	
				{13,24,65,69},	
		};
		
		int arr2[][]={
				{13,24,35,66},	
				{32,47,59,56},	
				{13,24,65,69},	
		};
		disp(arr1);
		System.out.println();
		disp(arr2);
		System.out.println();
		int arr3[][]=sum(arr1,arr2);
		disp(arr3);
	}
}
