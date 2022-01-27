package test;

public class hello4 {
	 int x;
	 static String s;
	 {
		 x=11;
		 s="hello";
		 System.out.println("init block called1 ");
	 }
	 
	 {
		 s="hi";
		 x=12;
		 System.out.println("init block called2 ");
	 }

	public hello4() {
		s="fi";
		x=13;
	  System.out.println("constructor called ");
	}
	
static {
	s="welcome";
	System.out.println("static block called ");
}	
	
	public static void main(String[] args) {
		System.out.println(s);
		System.out.println(new hello4().x);
		System.out.println("s is "+new hello4().s);
	
		System.out.println(s);
		System.out.println(hello4.s);
	  
	}
}
