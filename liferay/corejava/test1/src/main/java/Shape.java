public class Shape {
    void area(){
        System.out.println("shape area");
    }
}

class Circle extends  Shape {
 float radius=78.45f;
    @Override
    void area() {
//        super.area();
        System.out.println("circle area   with radius "+radius+" is "+(3.14f*radius*radius));
    }
}

class Rectangle extends  Shape {
    float width=56.67f;
    float length=78.56f;
    @Override
    void area() {
        System.out.println("area of rectangle with width "+width+" and length "+length+" is "+(width*length));
    }
}

class ShapeMain{
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.area();

        Rectangle rectangle=new Rectangle();
        rectangle.area();
    }
}