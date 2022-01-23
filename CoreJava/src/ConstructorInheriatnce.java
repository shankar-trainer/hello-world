class X {
	public X() {
		 super();
		System.out.println("Constructor X");
	}
}

class Y extends X {
	public Y() {
		super();
		System.out.println("Constructor Y");
	}
}

class Z extends Y {
	public Z() {
		super();
		System.out.println("Constructor Z");
	}
}

public class ConstructorInheriatnce {
	public static void main(String[] args) {
		new Z();
	}
}
