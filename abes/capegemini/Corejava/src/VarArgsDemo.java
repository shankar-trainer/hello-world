public class VarArgsDemo {
	static void disp(int a, int b, int... c) {
         System.out.println(a);
         System.out.println(b);
	}
	static void show(int... p){
		 for (int i : p) {
			System.out.print(i+"  ");
		}
	}
	public static void main(String... args) {
		int x = 10, y = 20, z = 90;
		int ar[] = { 11, 12, 13, 14 };

		disp(x, y, z);
		disp(x, y, ar);
		disp(1,2,3,4,5,6,7,8);
		
		show(1,2,34,4);
		show(1,2,34,4,11,22,33,44);
		show(x,y,z);
		show(new int[]{1,2,3,4,5});
		 

	
		
	}
}
