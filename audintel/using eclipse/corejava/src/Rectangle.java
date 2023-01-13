class Rectangle extends Shape {
	private float width;
	private float length;

	public Rectangle(String color, String border, float width, float length) {
		super(color, border);
		this.width = width;
		this.length = length;
	}

	@Override
	public void draw() {
		System.out.println("draw the rectangle");
	}

	@Override
	public void area() {
		System.out.println("Area of rectangle is "+(width*length));
	}

}
