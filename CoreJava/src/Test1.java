
public class Test1 {
 protected  void info(String s) {
	 System.out.println("test1 info "+s);
 }
}

class Test2 extends Test1{
	
	@Override
protected void info(String s) {
		System.out.println("test2 info ");
	}
	
	public static void main(String[] args) {
	
		Test2 t1=new Test2();
		t1.info("hi..");
	}
}
