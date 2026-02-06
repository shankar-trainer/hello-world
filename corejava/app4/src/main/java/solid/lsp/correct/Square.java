package solid.lsp.correct;

public class Square implements Shape {

    private float side;
    @Override
    public float area() {
        return side*side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(12);
        System.out.println("area of rectangle "+rectangle.area());
        Square square=new Square();
        square.setSide(10);
        System.out.println("area of square "+square.area());
    }
}
