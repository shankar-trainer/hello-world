
public class ShapeMain {

	public static void main(String[] args) {
		Rectangle1 rectangle1=new Rectangle1(56.4f, 100.2f);
		Circle2 circle1=new Circle2(12.4f);
		
		rectangle1.area();
		rectangle1.draw();
		
		circle1.area();
		circle1.draw();
	}
}
