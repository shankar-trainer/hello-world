
public class Array2 {

	public static void main(String[] args) {
		int ar1[][] = {
				{ 1, 2, 3 }, // ar1[0]
				{ 4, 5, 6 }, // ar1[1]
				{ 7, 8, 9 },// ar1[2]
				{ 10, 11, 12 } 
			
		};
System.out.println(ar1.length);
System.out.println(ar1[0].length);

for(int d:ar1[0]) {
	System.out.println(d);
}
	}
}
