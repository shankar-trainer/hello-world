package corejava;

public class Array2 {
	
	void disp(String name,int y,int... ar){
		System.out.println(name);
		for (int i : ar) {
			System.out.print(i+"  ");
		}
		System.out.println(ar[0]);
		
	}
	
	public static void main(String... args) {
		
		Array2 array2=new Array2();
		array2.disp("ram kumar", 11,22,33,44,55);
		int ar[]={1,2,3,4};
		
		array2.disp("ram kumar", 22,ar);
	}
	
}
