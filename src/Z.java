class Y{
	int p=100;
	void show() {
		System.out.println("show method in Y super  class");
	}
}

public class Z  extends Y{
   int p=200;
   
	@Override
	void show() {
		int p=10;
		System.out.println("local p is "+p);
		System.out.println("instance p is "+this.p);
		System.out.println("super class p is "+super.p);
		System.out.println("show method in Z sub  class");
		super.show();
	}
	public static void main(String[] args) {
       new Z().show();
	}
}
