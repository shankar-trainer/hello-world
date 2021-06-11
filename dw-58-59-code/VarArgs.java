
public class VarArgs {

	static void disp(int a, int b, int ... c) {
		System.out.println(" ......................");
		System.out.println("1st "+a);
		System.out.println("2nd  "+b);
		for (int i : c) {
			System.out.println("\t"+i);
		}
	}
	
	public static void main(String... args) {
		disp(1,2,3);
		disp(1,2);
		
		disp(999,888,new int[] {11,22,44});
		disp(999,888,01,1,2,3);
		
		
	}
}
