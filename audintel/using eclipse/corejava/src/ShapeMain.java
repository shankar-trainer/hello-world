public class ShapeMain {

	public static void main(String[] args) {
		//Shape s=new Shape();
		
		Shape shape[]=new Shape[4];
		
		shape[0]=new Rectangle("blue", "solid", 34.5f, 56.7f);
		shape[1]=new Circle("green", "thin", 44.5f);
		
		shape[2]=new Rectangle("red", "thick", 14.5f, 60.7f);
		shape[3]=new Circle("pink", "dotted", 48.5f);
		
		
		for (Shape shape2 : shape) {
			System.out.println("--------------------------\n");
			shape2.draw();
			shape2.display();
			shape2.area();
			System.out.println("\n--------------------------\n");
		}
	}
}
