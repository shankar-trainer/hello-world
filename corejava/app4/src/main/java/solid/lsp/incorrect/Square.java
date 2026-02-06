package solid.lsp.incorrect;

public class Square extends  Rectangle {

    public void setWidth(float width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(float height) {
        this.height = height;
        this.width = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(12);
        rectangle.setWidth(20);
        System.out.println("read of rectangle "+rectangle.area());

        Square square=new Square();
        square.setWidth(6);
        square.setHeight(7);
        System.out.println("square "+square.area());
    }
}
