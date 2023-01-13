
public abstract class Shape {
	private String color;
	private String border;

	public Shape(String color, String border) {
		super();
		this.color = color;
		this.border = border;
	}

	public abstract void draw();
	public abstract void area();
	
	public void display() {
        System.out.println("color of shape is  "+color);		
        System.out.println("border  of shape is  "+border);		
	}
}

