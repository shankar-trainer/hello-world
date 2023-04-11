class Circle extends Shape {
	private float radius;

	public Circle(String color, String border, float radius) {
		super(color, border);
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of circle is "+(Math.PI*radius*radius));
	}

	@Override
	public void draw() {
		System.out.println("draw the Circle");
	}
}
