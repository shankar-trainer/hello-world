
public class VarArgs {

	static void printIt(int ...p) {
		for (int i : p) {
			System.out.print(i+"  ,");
		}
		System.out.println();
	}
	static void show(int p, int q, int ...r) {
		System.out.println("show method");
		System.out.println(p);
		System.out.println(q);
	} 
	public static void main(String  ...args) {
		int ar[]= {1,2,3,4,5,6};
		int a=10,b=20;
		
		printIt(ar);
		printIt(a,b);
		printIt(10000);
		printIt(11,22,33,44,55,66);
		
		printIt(a,b,11,22,33,44,55,66);
	show(a,b,11,22,33,44,55,66);
		
		
		
		
		
	}
}
