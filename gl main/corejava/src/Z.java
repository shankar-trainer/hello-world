
class X{
	int x=1000;
	
 static void show(){
		System.out.println("X static method");
	}	
}

public class Z extends X{
	//@Override
	static void show(){
		System.out.println("Z static method");
	}

	
	int x=100;
	
	 void disp(){
		int x=10;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		new Z().disp();
		show();
		X.show();
	}
}
