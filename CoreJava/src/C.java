
public class C {
  int x=1000;
  
}
class B extends C{
	int x=100;
	
	void disp() {
		int x=10;
		System.out.println("local x is "+x);
		System.out.println("current class  x is "+this.x);
		System.out.println("super class  x is "+super.x);
	}
	public static void main(String[] args) {
		B b=new B();
		b.disp();
	}
}