
public class ShapeMain {

	public static void main(String[] args) {

		Shape shape = new Rectangle();
		Rectangle rectangle = new Rectangle();

		Shape shape1 = new Square();
		Square square=new Square();
		
		
		System.out.println("shape is "+shape1.shape);
		shape.area();
		shape.draw();
		//shape.perimiter();  // error 
	
		System.out.println("shape is "+rectangle.shape);
		rectangle.area();
		rectangle.draw();
		rectangle.perimiter();  // no error 
		
		
	}
	
}
