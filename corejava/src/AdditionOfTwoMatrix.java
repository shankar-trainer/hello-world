public class AdditionOfTwoMatrix {

	static void display1(int ar[][]) {
		System.out.println("=========================");
		for (int[] is : ar) {
			for (int is2 : is) {
				System.out.print(is2+", ");
			}
			System.out.println();
		}
	}
	static int[][] sum(int a[][], int b[][]){
		int c[][]=new int[a.length][a[0].length];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		
		int ar1[][]= {
				{1,2,},
				{3,4,},
				{5,6,},
		};
		int ar2[][]= {
				{6,5,},
				{4,3,},
				{2,1,},
		};
		
		display1(ar1);
		display1(ar2);
		display1(sum(ar1, ar2));
		
	}
}
