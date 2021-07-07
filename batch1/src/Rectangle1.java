class Rectangle1 extends Shape1 {
	private float width;
	private float length;

	public Rectangle1(float width, float length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	void draw() {
		System.out.println("draw the rectangle ");
	}

	@Override
	void area() {
		System.out.println("area of rectangle is " + (width * length));
	}

}