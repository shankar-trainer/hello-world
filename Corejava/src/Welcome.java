class Greeting {
protected	void show(String s) {
		System.out.println("show method of greeting");
	}
}

public class Welcome extends Greeting {
@Override
//private
  //protected
 public  void show(String s) {
	 System.out.println("show method in Welcome");
	}
	
	public static void main(String[] args) {
		 Welcome welcome=new Welcome();
		 welcome.show("");
	}
}
