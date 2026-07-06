package designPattern.creational.factory;
public interface Shape {
    void draw();
}

class ShapeFactory {
    public Shape getShape(String type) {
        switch (type) {
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            default:
                return null;
        }
    }
}

class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("circle");
        shape1.draw();
        shape1 = factory.getShape("square");
        shape1.draw();
        shape1 = factory.getShape("rectangle");
        shape1.draw();


    }
}