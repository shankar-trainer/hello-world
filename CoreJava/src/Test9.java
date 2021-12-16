
public class Test9 {
	int x;// instance variable
			// default value 0, null

	public static void main(String[] args) {
		Test9 t = new Test9();
		System.out.println(t.x);
		int y;// local variable no default value
		// System.out.println(y);
		char c='a';
		char d='\u0000';
		System.out.println(d);
		d='न';
		System.out.println(d);
	}

}
