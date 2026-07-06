package designPattern.creational.prototype;

public interface Prototype {
Prototype clone();
}

class Circle implements  Prototype{
     private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius);
    }

    public static void main(String[] args) {
        Circle circle1=new Circle(100);
        Circle circle2= (Circle) circle1.clone();
        System.out.println(circle1);
        System.out.println(circle2);
    }
}


