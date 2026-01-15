
public class Array1 {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4};// one dimension array
//           ar= {22,331,2}; // error 
		int[] ar1;

		// initialization
		ar1 = new int[4]; // make the array of 4 elements, each element will initialized with 0

		System.out.println(ar1.length);// length is property of array
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]); // array index start from 0 to array length -1

		ar1[0] = 11;
		ar1[1] = 22;
		ar1[2] = 33;
		ar1[3] = 11;

		int index = 0;
		do {
			System.out.print(ar1[index]+", ");
			index++;
		} while (index < ar1.length);
	}
}
