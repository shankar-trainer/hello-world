
public class Human {
  void say() {
	  System.out.println("i am human");
  }
}
class Patient extends  Human {
	 @Override  
	void say() {
		  System.out.println("i am Patient");
	  }
}
class Doctor extends  Human {
	@Override  
	void say() {
		System.out.println("i am Doctor");
	}
}
class Father extends  Human {
	@Override  
	void say() {
		System.out.println("i am Father");
	}
}


