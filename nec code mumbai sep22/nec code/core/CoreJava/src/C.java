
class B{
	int x=100;
	
}

public class C  extends B{
	int x=1000;
	void show() {
		int x=10000;
		System.out.println("local x "+x);
		System.out.println("current class  x "+this.x);
		System.out.println("super  class  x "+super.x);
	}
	
	public static void main(String[] args) {
		new C().show();
	}

}
