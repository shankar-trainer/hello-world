sealed class Shape
        permits Circle, Square, Rectangle {
}

final class Circle extends Shape {
    public float radius;
}

non-sealed class Square extends Shape {
    public double side;
}

sealed class Rectangle extends Shape permits FilledRectangle {
    public double length, width;
}

final class FilledRectangle extends Rectangle {
    public int red, green, blue;
}