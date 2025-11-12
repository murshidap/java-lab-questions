abstract class Shape {
    abstract void area();
}

abstract class TwoDim extends Shape {}
abstract class ThreeDim extends Shape {}

class Square extends TwoDim {
    double side = 5;
    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Triangle extends TwoDim {
    double base = 6, height = 4;
    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

class Sphere extends ThreeDim {
    double radius = 3;
    void area() {
        System.out.println("Surface Area of Sphere: " + (4 * 3.14159 * radius * radius));
    }
}

class Cube extends ThreeDim {
    double side = 4;
    void area() {
        System.out.println("Surface Area of Cube: " + (6 * side * side));
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape s1 = new Square();
        Shape s2 = new Triangle();
        Shape s3 = new Sphere();
        Shape s4 = new Cube();

        s1.area();
        s2.area();
        s3.area();
        s4.area();
    }
}
