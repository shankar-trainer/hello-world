
public class ArrayAddition {
 static void arrayDisp(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
			 System.out.print(a[i][j]+", ");
			}
			System.out.println();
			}	 
 }
	
	public static void main(String[] args) {
		    // 3 x 4 array
		int ar1[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{8,2,30,44},
		};
		int ar2[][]= {
				{11,22,30,40},
				{55,66,7,80},
				{18,12,30,44},
		};
		System.out.println("first array\n");
		arrayDisp(ar1);
		
		System.out.println("second array\n");
		arrayDisp(ar2);
		
		int ar3[][]=new int[ar2.length][ar2[0].length];
		
		System.out.println(ar2.length+" rows");
		System.out.println(ar2[0].length+" cols");
		
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[0].length; j++) {
				ar3[i][j]=ar1[i][j]+ar2[i][j];
			}
		}
	
		System.out.println("sum of arrays\n");
		arrayDisp(ar3);
	}
}
