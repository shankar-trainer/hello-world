
public class MyTest2 {

	int x=10;
	int y=10;
	
	String a="hello";
	String b="hello";
	
	void disp(){
		x=x+10;
	disp1(y,b);
	}
	
	void disp1(int p, String k){
		a=a+" world";
		k=k+" java";
		p=p+100;
	}
	
	public static void main(String[] args) {
		MyTest2 test2=new MyTest2();
		test2.disp();
		System.out.println(test2.x);
		System.out.println(test2.y);
		System.out.println(test2.a);
		System.out.println(test2.b);
		
	}
}
