
class X {
	X() {
		super();
		System.out.println("Constructor x called");
	}
}

class Y extends X {

	Y() {
		// super();
		System.out.println("Constructor Y called");
	}
}

public class Z extends Y {

	private Z() {
		super();
		System.out.println("Constructor Z called");
	}

	public static void main(String[] args) {
		new Z();
	}
}



//abstract final 
class hello{
	
	
}