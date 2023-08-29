
public abstract class Welcome {
     int x;
     int y;
     
	abstract void show();// 
	
	void info() {
		System.out.println("info about abstract class");
	}
}

class Greeting extends Welcome{

	@Override
	void show() {
		System.out.println("this is show method");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
	
	public static void main(String[] args) {
		Welcome welcome=new Greeting();
		Greeting greeting=new Greeting();
		
		//Welcome welcome1=new Welcome();// error 
		
		welcome.x=10;
		welcome.y=20;
		welcome.show();
		welcome.info();
	}
}
