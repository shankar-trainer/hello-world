public abstract class MyShape {
	abstract void draw();
	abstract void area();
	
	void info() {
		System.out.println("myshape information ");
	}
}

class MyCircle extends MyShape {
	float radius;

	public MyCircle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	void draw() {
		System.out.println("\ndraw circle ");
	}

	@Override
	void area() {
		System.out.printf("\n circle area is %.2f" , (Math.PI * radius * radius));
	}

}
