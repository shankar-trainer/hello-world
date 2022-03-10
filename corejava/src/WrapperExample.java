
public class WrapperExample {

	public static void main(String[] args) {
		int x=10;
		 Integer p=new Integer(x); // boxing primitive to wrapper class
		 // with object we cannot do arithmetic operation
		 // with primitive  we can do arithmetic operation
		 
		 int y=p.intValue();// unboxing -- wrapper class to primitive
		 y++;
		 p=new Integer(y);
		 System.out.println(p);
		 
	}
}
