
public class Test5 {

	int x;// instance variable 
	static int p;// class variable 
	public static void main(String[] args) {
	  int y=100;// local variable has no default value
	          // it must be initialized before use 
	  System.out.println(y);
	  Test5 t=new Test5();
	  System.out.println(t.x);
	  System.out.println(p);
	}
}
