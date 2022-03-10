class A{
	int a=10;
}


public class C extends A {

	int a=100;
	
	void show() {
		int a=1000;
		System.out.println("local a  "+a);
		System.out.println("current class  a  "+this.a);
		System.out.println("super  class  a  "+super.a);
	}
	
	
	public static void main(String[] args) {
		new C().show();
		
		C c=new C();
		c.show();
		c.show();
	}
	
}
