
public class ArrayDemo2 {

	public static void main(String[] args) {
	
		int ar1[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};

		//System.out.println(ar1.length);
		//System.out.println(ar1[0].length);
		
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[0].length; j++) {
				System.out.print(ar1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
