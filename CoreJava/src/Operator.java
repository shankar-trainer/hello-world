
public class Operator {

	public static void main(String[] args) {

		int x = 10;
		x = x + 1;
		System.out.println(x);
		System.out.println(x++);// x++ post increment
		System.out.println(x);
		System.out.println(++x);//++x -- pre increment , it will be incremented and assigned both
		
		int y=20;
		//y=y+2;
		y+=2;  // compound assignment
		System.out.println("y "+y);
		int z=30;
		z=z+1;
		System.out.println("z "+z);
		
		z+=1;
		System.out.println("z "+z);
		z++;
		System.out.println("z "+z);

	}
}
