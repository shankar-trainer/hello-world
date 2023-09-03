public abstract class MyShape {
   abstract void draw();
}

class MyCircle extends MyShape{
	@Override
	void draw() {
	 System.out.println("circle draw");
	}
}
class MyRectangle extends MyShape{
	@Override
	void draw() {
		System.out.println("rectangle draw");
	}
}

class MyShapeMain{
	public static void main(String[] args) {
		//MyShape shape=new MyShape();
		MyShape shape=new MyCircle();
		shape.draw();
		shape=new MyRectangle();
		shape.draw();
	}
}